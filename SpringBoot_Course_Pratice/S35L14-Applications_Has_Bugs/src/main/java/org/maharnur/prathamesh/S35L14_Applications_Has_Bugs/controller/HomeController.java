package org.maharnur.prathamesh.S35L14_Applications_Has_Bugs.controller;

import java.util.List;

import org.maharnur.prathamesh.S35L14_Applications_Has_Bugs.models.Post;
import org.maharnur.prathamesh.S35L14_Applications_Has_Bugs.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    
    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String home(Model model){
        List<Post> posts = postService.getAll();
        model.addAttribute("posts", posts);
        return "home";
    }

    @GetMapping("/editor")
    public String editor(Model model){
        return "editor";
    }
}

