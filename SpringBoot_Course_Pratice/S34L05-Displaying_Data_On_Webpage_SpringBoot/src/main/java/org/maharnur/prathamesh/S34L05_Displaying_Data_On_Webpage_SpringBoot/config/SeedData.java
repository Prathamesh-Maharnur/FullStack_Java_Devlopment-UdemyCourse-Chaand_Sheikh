package org.maharnur.prathamesh.S34L05_Displaying_Data_On_Webpage_SpringBoot.config;

import java.util.List;

import org.maharnur.prathamesh.S34L05_Displaying_Data_On_Webpage_SpringBoot.models.Post;
import org.maharnur.prathamesh.S34L05_Displaying_Data_On_Webpage_SpringBoot.services.PostService;
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
            post01.setTitle("Post 01 Title");
            post01.setBody("Post 01 Body ......................");
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("Post 02 Title");
            post02.setBody("Post 02 Body ......................");
            postService.save(post02);
        }
    }
    
}
