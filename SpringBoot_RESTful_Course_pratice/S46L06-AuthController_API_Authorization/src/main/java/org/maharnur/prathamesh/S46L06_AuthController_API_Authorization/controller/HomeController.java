package org.maharnur.prathamesh.S46L06_AuthController_API_Authorization.controller;

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

    @GetMapping("/test")
    @Tag(name="Test", description="The Test API")
    @SecurityRequirement(name="springboot-demo-api")
    public String tests(){
        return "Test Api";
    }
}
