package org.maharnur.prathamesh.S36L09_Delete_Post_InBlogApp.repositories;

import org.maharnur.prathamesh.S36L09_Delete_Post_InBlogApp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
