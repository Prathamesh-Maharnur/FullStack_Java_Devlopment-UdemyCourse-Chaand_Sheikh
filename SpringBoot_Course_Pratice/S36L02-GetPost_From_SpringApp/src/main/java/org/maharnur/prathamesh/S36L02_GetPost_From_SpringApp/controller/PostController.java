package org.maharnur.prathamesh.S36L02_GetPost_From_SpringApp.controller;

import java.util.Optional;

import org.maharnur.prathamesh.S36L02_GetPost_From_SpringApp.models.Post;
import org.maharnur.prathamesh.S36L02_GetPost_From_SpringApp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {
    
    @Autowired
    private PostService postService;

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model){
        Optional<Post> optionalPost = postService.findById(id);
        if(optionalPost.isPresent()){
            Post post = new Post();
            model.addAttribute("post",post);
            return "post_views/post";
        }else{
            return "404";
        }
    }
}
