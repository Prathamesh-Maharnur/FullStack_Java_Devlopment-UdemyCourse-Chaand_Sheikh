package org.maharnur.prathamesh.S39L01_Remember_Me.repositories;

import org.maharnur.prathamesh.S39L01_Remember_Me.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
