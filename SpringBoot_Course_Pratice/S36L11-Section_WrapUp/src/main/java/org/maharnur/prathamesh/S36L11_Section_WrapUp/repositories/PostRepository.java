package org.maharnur.prathamesh.S36L11_Section_WrapUp.repositories;

import org.maharnur.prathamesh.S36L11_Section_WrapUp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
