package org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.repositories;

import org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
