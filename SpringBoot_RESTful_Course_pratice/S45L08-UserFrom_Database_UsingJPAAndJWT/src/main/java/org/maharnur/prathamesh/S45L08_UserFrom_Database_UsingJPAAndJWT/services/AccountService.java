package org.maharnur.prathamesh.S45L08_UserFrom_Database_UsingJPAAndJWT.services;

import org.maharnur.prathamesh.S45L08_UserFrom_Database_UsingJPAAndJWT.model.Account;
import org.maharnur.prathamesh.S45L08_UserFrom_Database_UsingJPAAndJWT.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Account save(Account account){
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        return accountRepository.save(account); 
    }
}
