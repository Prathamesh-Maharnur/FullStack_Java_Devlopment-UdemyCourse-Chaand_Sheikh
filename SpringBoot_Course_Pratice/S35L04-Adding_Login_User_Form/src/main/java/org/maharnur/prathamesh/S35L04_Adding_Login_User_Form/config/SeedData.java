package org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.config;

import java.util.List;

import org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.models.Account;
import org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.models.Post;
import org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.services.AccountService;
import org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner{

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("abc@gmail.com");
        account01.setPassword("password");
        account01.setFirstname("user01");

        account02.setEmail("def@gmail.com");
        account02.setPassword("password");
        account02.setFirstname("user02");

        accountService.save(account01);
        accountService.save(account02);

        List<Post> posts = postService.getAll();
        
        if(posts.size() == 0){
            Post post01 = new Post();
            Post post02 = new Post();

           
            
            post01.setTitle("post 01 Title");
            post01.setBody("post 01 body ................");
            post01.setAccount(account01);
            postService.save(post01);

            post02.setTitle("post 02 title");
            post02.setBody("post 02 body ................");
            post02.setAccount(account02);
            postService.save(post02);
        }
    }
    
}
