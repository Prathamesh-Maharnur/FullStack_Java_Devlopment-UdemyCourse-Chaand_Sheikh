package org.maharnur.prathamesh.S40L01_AddingPagination_AndSorting.controller;

import java.util.List;

import org.maharnur.prathamesh.S40L01_AddingPagination_AndSorting.models.Post;
import org.maharnur.prathamesh.S40L01_AddingPagination_AndSorting.services.PostService;
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
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "home_views/home";
    }

}

