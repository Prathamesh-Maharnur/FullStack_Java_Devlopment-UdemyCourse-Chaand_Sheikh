package org.maharnur.prathamesh.S34L03_Adding_Repository_And_Service_Classes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model){
        return "home";
    }
}
