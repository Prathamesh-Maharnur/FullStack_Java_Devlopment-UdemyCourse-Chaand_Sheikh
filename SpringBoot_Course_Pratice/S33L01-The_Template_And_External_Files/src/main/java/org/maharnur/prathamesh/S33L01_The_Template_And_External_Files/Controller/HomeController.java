package org.maharnur.prathamesh.S33L01_The_Template_And_External_Files.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String hello(Model model){
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }
}
