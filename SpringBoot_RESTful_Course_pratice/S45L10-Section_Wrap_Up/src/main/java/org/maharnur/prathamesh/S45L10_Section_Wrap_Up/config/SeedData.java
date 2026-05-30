package org.maharnur.prathamesh.S45L10_Section_Wrap_Up.config;

import org.maharnur.prathamesh.S45L10_Section_Wrap_Up.model.Account;
import org.maharnur.prathamesh.S45L10_Section_Wrap_Up.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner{

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("user@user.com");
        account01.setPassword("pass987");
        account01.setRole("ROLE_USER");
        accountService.save(account01);

        account02.setEmail("admin@admin.com");
        account02.setPassword("pass987");
        account02.setRole("ROLE_ADMIN");
        accountService.save(account02);
    }
    
}
