package org.maharnur.prathamesh.S47L12_Update_AlbumAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class HomeController {
    

    @GetMapping("/")
    public String demo(){
        return "Hello World";
    }

}
