package org.maharnur.prathamesh.S36L08_Handle_EditPostIn_BlogApp.repositories;

import org.maharnur.prathamesh.S36L08_Handle_EditPostIn_BlogApp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
