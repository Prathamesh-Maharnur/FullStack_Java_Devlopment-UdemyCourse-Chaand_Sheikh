package org.maharnur.prathamesh.S39L04_SendingEmail_For_PasswordReset.repositories;

import org.maharnur.prathamesh.S39L04_SendingEmail_For_PasswordReset.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
