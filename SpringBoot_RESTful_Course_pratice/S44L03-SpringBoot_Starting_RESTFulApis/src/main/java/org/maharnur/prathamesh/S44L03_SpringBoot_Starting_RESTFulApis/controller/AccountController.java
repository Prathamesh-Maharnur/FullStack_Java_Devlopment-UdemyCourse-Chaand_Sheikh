package org.maharnur.prathamesh.S44L03_SpringBoot_Starting_RESTFulApis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    

    @GetMapping("/")
    public String demo(){
        return "Hello World";
    }
}
