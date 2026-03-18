package org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.controller;

import java.util.List;

import org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.model.Post;
import org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String home(Model model){
        List<Post> posts = postService.getAll();
        model.addAttribute("posts",posts);
        return "home";
    }
}
