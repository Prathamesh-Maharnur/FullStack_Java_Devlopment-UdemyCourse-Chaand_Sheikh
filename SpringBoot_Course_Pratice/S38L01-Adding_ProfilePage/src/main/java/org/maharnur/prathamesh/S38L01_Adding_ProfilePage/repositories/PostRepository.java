package org.maharnur.prathamesh.S38L01_Adding_ProfilePage.repositories;

import org.maharnur.prathamesh.S38L01_Adding_ProfilePage.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
