package org.maharnur.prathamesh.S35L06_SpringSecurityLoginRules_BCrypt.services;

import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S35L06_SpringSecurityLoginRules_BCrypt.models.Account;
import org.maharnur.prathamesh.S35L06_SpringSecurityLoginRules_BCrypt.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    
    @Autowired
    private AccountRepository accountRepository;

    public Optional<Account> findById(Long id){
        return accountRepository.findById(id);
    }

    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    public void delete(Account account){
        accountRepository.delete(account);
    }

    public Account save(Account account){
        return accountRepository.save(account);
    }
}

