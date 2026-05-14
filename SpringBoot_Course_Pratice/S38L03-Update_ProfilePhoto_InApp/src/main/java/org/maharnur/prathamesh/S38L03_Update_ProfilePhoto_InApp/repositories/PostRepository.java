package org.maharnur.prathamesh.S38L03_Update_ProfilePhoto_InApp.repositories;

import org.maharnur.prathamesh.S38L03_Update_ProfilePhoto_InApp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
