package org.maharnur.prathamesh.S36L07_Add_EditOption_InSpringBlogApp.controller;

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
