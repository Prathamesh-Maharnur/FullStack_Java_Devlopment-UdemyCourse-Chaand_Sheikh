package org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.config;

import java.util.List;

import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.models.Account;
import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.models.Authority;
import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.models.Post;
import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.services.AccountService;
import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.services.AuthorityService;
import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.services.PostService;
import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.util.constants.Privileges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner{

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private AuthorityService authorityService;

    @Override
    public void run(String... args) throws Exception {

        for(Privileges auth: Privileges.values()){
            Authority authority = new Authority();
            authority.setId(auth.getId());
            authority.setName(auth.getPrivilege());
            authorityService.save(authority);
        }

        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("abc@gmail.com");
        account01.setPassword("password");
        account01.setFirstname("user01");
        account01.setLastname("lastname");

        account02.setEmail("def@gmail.com");
        account02.setPassword("password");
        account02.setFirstname("user02");
        account02.setLastname("lastname");

        accountService.save(account01);
        accountService.save(account02);

       List<Post> posts = postService.getAll();
       if(posts.size() == 0){
        Post post01 = new Post();
        Post post02 = new Post();

        post01.setTitle("Post 01");
        post01.setBody("Post 01 body ................");
        post01.setAccount(account01);
        postService.save(post01);

        post02.setTitle("Post 02");
        post02.setBody("Post 02 body ................");
        post02.setAccount(account02);
        postService.save(post02);
        
       }
    }
    
}
