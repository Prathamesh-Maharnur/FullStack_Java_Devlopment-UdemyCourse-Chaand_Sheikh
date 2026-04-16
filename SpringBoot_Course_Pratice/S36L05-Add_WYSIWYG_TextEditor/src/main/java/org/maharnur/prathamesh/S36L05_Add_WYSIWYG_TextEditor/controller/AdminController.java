package org.maharnur.prathamesh.S36L05_Add_WYSIWYG_TextEditor.controller;

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
