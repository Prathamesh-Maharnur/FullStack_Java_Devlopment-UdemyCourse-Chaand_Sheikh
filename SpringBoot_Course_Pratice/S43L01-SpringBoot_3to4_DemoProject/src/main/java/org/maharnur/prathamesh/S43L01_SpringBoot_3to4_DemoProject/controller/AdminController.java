package org.maharnur.prathamesh.S43L01_SpringBoot_3to4_DemoProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String admin(Model model) {
        return "admin_views/admin";
    }
}
