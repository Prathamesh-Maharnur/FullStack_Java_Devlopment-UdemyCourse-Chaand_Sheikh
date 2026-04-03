package org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.models.Post;
import org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService{
    
    @Autowired
    private PostRepository postRepository;

    public Optional<Post> findById(Long id){
        return postRepository.findById(id);
    }

    public List<Post> getAll(){
        return postRepository.findAll();
    }

    public void delete(Post post){
        postRepository.delete(post);
    }

    public Post save(Post post){
        if(post.getCreatedAt() == null){
            post.setCreatedAt(LocalDateTime.now());
        }
        return postRepository.save(post);
    }
}

