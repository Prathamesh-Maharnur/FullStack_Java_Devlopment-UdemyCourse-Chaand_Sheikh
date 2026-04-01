package org.maharnur.prathamesh.S35L05_Adding_Spring_Security_Into_Application.repositories;

import org.maharnur.prathamesh.S35L05_Adding_Spring_Security_Into_Application.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
