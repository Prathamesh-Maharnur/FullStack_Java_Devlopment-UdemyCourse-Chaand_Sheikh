package org.maharnur.prathamesh.S38L01_Adding_ProfilePage.controller;

import java.security.Principal;
import java.util.Optional;

import org.maharnur.prathamesh.S38L01_Adding_ProfilePage.models.Account;
import org.maharnur.prathamesh.S38L01_Adding_ProfilePage.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class AccountController {
    
    @Autowired
    private AccountService accountService;

    @GetMapping("/register")
    public String register(Model model){
        Account account = new Account();
        model.addAttribute("account", account);
        return "account_views/register";
    }

    @PostMapping("/register")
    public String register_user(@Valid @ModelAttribute Account account, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "account_views/register";
        }

        accountService.save(account);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "account_views/login";
    }

    @GetMapping("/profile")
    @PreAuthorize("isAuthenticated()")
    public String profile(Model model, Principal principal){
        String authUser = "email";
        if(principal != null){
            authUser = principal.getName();
        }
        Optional<Account> optionalAccount = accountService.findOneByEmail(authUser);
        if(optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            model.addAttribute("account", account);
            model.addAttribute("photo", account.getPhoto());
            return "account_views/profile";
        }else{
            return "redirect:/?error";
        }
        
    }
    
  
}

