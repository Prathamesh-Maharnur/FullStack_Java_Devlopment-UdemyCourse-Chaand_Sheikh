package org.maharnur.prathamesh.S39L03_ResetPassword_AndTokenGeneration.repositories;

import org.maharnur.prathamesh.S39L03_ResetPassword_AndTokenGeneration.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
