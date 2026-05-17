package org.maharnur.prathamesh.S39L02_Add_ForgotPassword_View.repositories;

import org.maharnur.prathamesh.S39L02_Add_ForgotPassword_View.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
