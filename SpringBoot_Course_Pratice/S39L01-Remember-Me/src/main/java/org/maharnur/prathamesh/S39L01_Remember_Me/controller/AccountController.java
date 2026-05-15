package org.maharnur.prathamesh.S39L01_Remember_Me.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.maharnur.prathamesh.S39L01_Remember_Me.models.Account;
import org.maharnur.prathamesh.S39L01_Remember_Me.services.AccountService;
import org.maharnur.prathamesh.S39L01_Remember_Me.util.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Value("${app.default-photo-path}")
    private String photo_prefix;

    @GetMapping("/register")
    public String register(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "account_views/register";
    }

    @PostMapping("/register")
    public String register_user(@Valid @ModelAttribute Account account, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "account_views/register";
        }

        accountService.save(account);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "account_views/login";
    }

    @GetMapping("/profile")
    @PreAuthorize("isAuthenticated()")
    public String profile(Model model, Principal principal) {
        String authUser = "email";
        if (principal != null) {
            authUser = principal.getName();
        }
        Optional<Account> optionalAccount = accountService.findOneByEmail(authUser);
        if (optionalAccount.isPresent()) {
            Account account = optionalAccount.get();
            model.addAttribute("account", account);
            model.addAttribute("photo", account.getPhoto());
            return "account_views/profile";
        } else {
            return "redirect:/?error";
        }
    }

    @PostMapping("/profile")
    @PreAuthorize("isAuthenticated()")
    public String post_profile(@Valid @ModelAttribute Account account, BindingResult bindingResult, Principal principal,
            HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return "account_views/profile";
        }
        String authUser = "email";
        if (principal != null) {
            authUser = principal.getName();
        }
        Optional<Account> optionalAccount = accountService.findOneByEmail(authUser);
        if (optionalAccount.isPresent()) {
            Account account_by_id = accountService.findById(account.getId()).get();
            account_by_id.setEmail(account.getEmail());
            account_by_id.setPassword(account.getPassword());
            account_by_id.setFirstname(account.getFirstname());
            account_by_id.setLastname(account.getLastname());
            account_by_id.setAge(account.getAge());
            account_by_id.setDate_of_birth(account.getDate_of_birth());
            account_by_id.setGender(account.getGender());

            accountService.save(account_by_id);

            SecurityContextHolder.clearContext();
            // after clearing the authentication context the Http Session context has to be
            // removed for logout
            request.getSession().invalidate();
            return "redirect:/";
        } else {
            return "redirect:/?error";
        }
    }

    @PostMapping("/update_photo")
    @PreAuthorize("isAuthenticated()")
    public String update_profile(@RequestParam MultipartFile file, RedirectAttributes attributes, Principal principal) {
        if (file.isEmpty()) {
            attributes.addFlashAttribute("error", "No file uploaded");
            return "redirect:/profile";
        }
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            int length = 10;
            boolean useLetters = true;
            boolean useNumbers = true;

            // RandomStringUtils.random(length, useLetters, useNumbers) is deprecated
            String generatedString = RandomStringUtils.secure().next(length, useLetters, useNumbers);
            String final_photo_name = generatedString.concat(fileName);
            String absolute_fileLocation = AppUtils.get_upload_path(final_photo_name);

            // Paths.get() is not recommended because Paths class is going to be deprecated
            Path path = Path.of(absolute_fileLocation);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            attributes.addAttribute("message", "you uploaded successfully");

            String authUser = "email";
            if (principal != null) {
                authUser = principal.getName();
            }
            Optional<Account> optionalAccount = accountService.findOneByEmail(authUser);
            if (optionalAccount.isPresent()) {
                Account account = optionalAccount.get();
                Account account_by_id = accountService.findById(account.getId()).get();
                String relative_FileLocation = photo_prefix.replace("images/**", "uploads/" + final_photo_name);
                account_by_id.setPhoto(relative_FileLocation);

                accountService.save(account_by_id);
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "redirect:/profile";
        } catch (Exception e) {
            // TODO: handle execption
        }
        return "redirect:/profile?error";
    }

}
