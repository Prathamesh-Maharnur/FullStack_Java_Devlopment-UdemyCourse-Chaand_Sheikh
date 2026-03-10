package org.maharnur.prathamesh.S33L02_Adding_Fragments_Header_Footers.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

    @GetMapping("/book")
    public String book(Model model){
        return "book";
    }
}
