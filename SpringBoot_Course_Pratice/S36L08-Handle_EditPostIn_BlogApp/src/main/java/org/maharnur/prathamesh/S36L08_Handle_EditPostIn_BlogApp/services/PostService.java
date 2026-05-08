package org.maharnur.prathamesh.S36L08_Handle_EditPostIn_BlogApp.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S36L08_Handle_EditPostIn_BlogApp.models.Post;
import org.maharnur.prathamesh.S36L08_Handle_EditPostIn_BlogApp.repositories.PostRepository;
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
        post.setUpdatedAt(LocalDateTime.now());
        return postRepository.save(post);
    }
}

