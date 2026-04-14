package org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.repositories;

import org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
