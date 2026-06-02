package org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.controller;

import javax.security.sasl.AuthenticationException;

import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.model.Account;
import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.payload.auth.AccountDTO;
import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.payload.auth.TokenDTO;
import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.payload.auth.UserLoginDTO;
import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.services.AccountService;
import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.services.TokenService;
import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.util.constants.AccountError;
import org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.util.constants.AccountSuccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/auth")
@Tag(name = "Auth Controller", description = "Controller for Account management")
@Slf4j
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AccountService accountService;

    @PostMapping("/token")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<TokenDTO> token(@RequestBody UserLoginDTO userLogin) throws AuthenticationException {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(userLogin.getEmail(), userLogin.getPassword()));
            return ResponseEntity.ok(new TokenDTO(tokenService.generateToken(authentication)));
        } catch (Exception e) {
            log.debug(AccountError.TOKEN_GENERATION_ERROR.toString() + " : " + e.getMessage());
            return new ResponseEntity<>(new TokenDTO(null), HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping("/users/add")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> addUser(@RequestBody AccountDTO accountDTO) {
        try {
            Account account = new Account();
            account.setEmail(accountDTO.getEmail());
            account.setPassword(accountDTO.getPassword());
            account.setRole("ROLE_USER");
            accountService.save(account);
            return ResponseEntity.ok(AccountSuccess.ACCOUNT_ADDED.toString());
        } catch (Exception e) {
            log.debug(AccountError.ADD_ACCOUNT_ERROR.toString()+": "+e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
