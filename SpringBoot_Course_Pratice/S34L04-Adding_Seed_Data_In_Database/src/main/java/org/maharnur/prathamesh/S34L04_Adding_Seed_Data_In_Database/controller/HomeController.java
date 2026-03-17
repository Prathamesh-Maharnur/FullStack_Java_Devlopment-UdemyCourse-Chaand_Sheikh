package org.maharnur.prathamesh.S34L04_Adding_Seed_Data_In_Database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
