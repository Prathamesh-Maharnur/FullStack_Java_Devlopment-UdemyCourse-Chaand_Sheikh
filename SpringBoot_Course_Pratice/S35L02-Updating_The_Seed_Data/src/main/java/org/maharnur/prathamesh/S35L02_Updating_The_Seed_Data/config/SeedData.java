package org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.config;

import java.util.List;

import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.models.Account;
import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.models.Post;
import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.services.AccountService;
import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.services.PostService;
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
        List<Post> posts = postService.getAll();

        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("abc@gmail.com");
        account01.setFirstname("user01");
        account01.setPassword("password");

        account02.setEmail("def@gmail.com");
        account02.setFirstname("user02");
        account02.setPassword("password");

        accountService.save(account01);
        accountService.save(account02);

        if(posts.size() == 0){
            Post post01 = new Post();
            post01.setTitle("Post 01 title");
            post01.setBody("Post 01 body .......................");
            post01.setAccount(account01);
            postService.save(post01);
            

            Post post02 = new Post();
            post02.setTitle("Post 02 title");
            post02.setBody("Post 02 body .......................");
            post02.setAccount(account02);
            postService.save(post02);
            
        }
    }


}
