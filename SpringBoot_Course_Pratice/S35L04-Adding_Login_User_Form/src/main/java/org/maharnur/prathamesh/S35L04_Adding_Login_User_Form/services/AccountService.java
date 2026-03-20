package org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.services;

import org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.models.Account;
import org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.repositories.AccountRepository;
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
