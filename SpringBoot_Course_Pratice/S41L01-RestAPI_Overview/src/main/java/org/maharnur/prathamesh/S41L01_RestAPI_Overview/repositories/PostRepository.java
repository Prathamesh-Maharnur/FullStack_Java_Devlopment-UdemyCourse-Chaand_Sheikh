package org.maharnur.prathamesh.S41L01_RestAPI_Overview.repositories;

import org.maharnur.prathamesh.S41L01_RestAPI_Overview.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
