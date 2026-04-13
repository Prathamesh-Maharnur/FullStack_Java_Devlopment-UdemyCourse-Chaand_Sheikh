package org.maharnur.prathamesh.S36L02_GetPost_From_SpringApp.repositories;

import org.maharnur.prathamesh.S36L02_GetPost_From_SpringApp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
