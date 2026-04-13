package org.maharnur.prathamesh.S36L03_ViewPost_With_EditOptions.controller;

import java.security.Principal;
import java.util.Optional;

import org.maharnur.prathamesh.S36L03_ViewPost_With_EditOptions.models.Post;
import org.maharnur.prathamesh.S36L03_ViewPost_With_EditOptions.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {
    
    @Autowired
    private PostService postService;

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
}
