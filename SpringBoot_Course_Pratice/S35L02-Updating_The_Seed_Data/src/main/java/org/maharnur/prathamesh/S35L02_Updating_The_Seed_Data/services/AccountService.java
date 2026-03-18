package org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.services;

import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.models.Account;
import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.repositories.AccountRepository;
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
