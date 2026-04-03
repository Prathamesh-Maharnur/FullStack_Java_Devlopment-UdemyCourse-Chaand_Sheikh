package org.maharnur.prathamesh.S35L06_SpringSecurityLoginRules_BCrypt.repositories;

import org.maharnur.prathamesh.S35L06_SpringSecurityLoginRules_BCrypt.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
