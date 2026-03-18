package org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.config;

import java.util.List;

import org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.models.Post;
import org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner{
    
    @Autowired
    private PostService postService;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();
    
        if(posts.size() == 0){
            Post post01 = new Post();
            post01.setTitle("post 01 title");
            post01.setBody("post 01 body ........................");
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("post 02 title");
            post02.setBody("post 02 body ........................");
            postService.save(post02);
        }
    }

    

}
