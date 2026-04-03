package org.maharnur.prathamesh.S35L05_Adding_Spring_Security_Into_Application.services;

import org.maharnur.prathamesh.S35L05_Adding_Spring_Security_Into_Application.models.Account;
import org.maharnur.prathamesh.S35L05_Adding_Spring_Security_Into_Application.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    
    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account){
        return accountRepository.save(account);
    }
}
