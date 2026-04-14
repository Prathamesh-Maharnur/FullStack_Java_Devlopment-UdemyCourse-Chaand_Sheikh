package org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.controller;

import java.security.Principal;
import java.util.Optional;

import org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.models.Account;
import org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.models.Post;
import org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.services.AccountService;
import org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {
    
    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/post/{id}")
    public String getPost(@PathVariable Long id, Model model, Principal principal){
        Optional<Post> optionalPost = postService.findById(id);
        String authUser = "email";
        if(optionalPost.isPresent()){
            Post post = optionalPost.get();
            model.addAttribute("post",post);
            if(principal != null){
                authUser = principal.getName();
            }
            if(authUser.equals(post.getAccount().getEmail())){
                model.addAttribute("isOwner",true);
            }else{
                model.addAttribute("isOwner",false);
            }

            return "post_views/post";
        }else{
            return "404";
        }
    }

    @GetMapping("/posts/add")
    public String add_post(Model model, Principal principal){
        String authUser = "email";
        if(principal != null){
            authUser = principal.getName();
        }
        Optional<Account> optionalAccount = accountService.findOneByEmail(authUser);
        if(optionalAccount.isPresent()){
            Post post = new Post();
            post.setAccount(optionalAccount.get());
            model.addAttribute("post",post);
            return "post_views/add_post";
        }
        else{
            return "redirect:/";
        }
        
    }
}
