package org.maharnur.prathamesh.S39L07_PasswordChange_In_SpringBoot.repositories;

import org.maharnur.prathamesh.S39L07_PasswordChange_In_SpringBoot.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
