package org.maharnur.prathamesh.S47L15_Delete_Photo_API.config;

import org.maharnur.prathamesh.S47L15_Delete_Photo_API.model.Account;
import org.maharnur.prathamesh.S47L15_Delete_Photo_API.services.AccountService;
import org.maharnur.prathamesh.S47L15_Delete_Photo_API.util.constants.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("user@user.com");
        account01.setPassword("pass987");
        account01.setAuthorities(Authority.USER.toString());
        
        accountService.save(account01);

        account02.setEmail("admin@admin.com");
        account02.setPassword("pass987");
        account02.setAuthorities(Authority.ADMIN.toString() + " " + Authority.USER.toString());
        
        accountService.save(account02);
    }

}
