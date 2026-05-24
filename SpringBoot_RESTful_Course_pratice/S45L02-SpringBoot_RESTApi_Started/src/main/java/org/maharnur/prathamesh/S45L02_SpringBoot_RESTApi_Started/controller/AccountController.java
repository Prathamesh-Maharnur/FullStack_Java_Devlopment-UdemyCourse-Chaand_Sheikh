package org.maharnur.prathamesh.S45L02_SpringBoot_RESTApi_Started.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    

    @GetMapping("/")
    public String demo(){
        return "Hello World";
    }

    @GetMapping("/test")
    public String tests(){
        return "Test Api";
    }
}
