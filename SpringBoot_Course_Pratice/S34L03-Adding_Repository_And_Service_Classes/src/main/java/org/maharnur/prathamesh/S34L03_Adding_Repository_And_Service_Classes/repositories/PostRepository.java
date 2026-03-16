package org.maharnur.prathamesh.S34L03_Adding_Repository_And_Service_Classes.repositories;

import org.maharnur.prathamesh.S34L03_Adding_Repository_And_Service_Classes.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
