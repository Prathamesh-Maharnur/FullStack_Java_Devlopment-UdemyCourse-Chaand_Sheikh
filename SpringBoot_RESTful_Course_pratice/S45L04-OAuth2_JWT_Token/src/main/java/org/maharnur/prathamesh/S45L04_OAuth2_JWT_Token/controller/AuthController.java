package org.maharnur.prathamesh.S45L04_OAuth2_JWT_Token.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    

    @PostMapping("/token")
    public String token(){
        return null;
    }    
}
