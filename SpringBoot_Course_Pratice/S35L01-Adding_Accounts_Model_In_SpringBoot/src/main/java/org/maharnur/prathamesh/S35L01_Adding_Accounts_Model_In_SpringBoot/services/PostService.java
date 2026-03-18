package org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.models.Post;
import org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    
    @Autowired
    private PostRepository postRepository;

    public Optional<Post> findById(Long Id){
        return postRepository.findById(Id);
    }

    public List<Post> getAll(){
        return postRepository.findAll();
    }

    public void delete(Post post){
        postRepository.delete(post);
    }

    public Post save(Post post){
        if(post.getId() == null){
            post.setCreatedAt(LocalDateTime.now());
        }
        return postRepository.save(post);
    }
}
