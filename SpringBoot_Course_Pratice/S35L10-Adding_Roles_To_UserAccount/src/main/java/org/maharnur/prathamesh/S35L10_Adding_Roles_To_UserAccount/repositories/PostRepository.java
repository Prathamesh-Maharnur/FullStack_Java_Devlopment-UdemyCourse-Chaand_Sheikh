package org.maharnur.prathamesh.S35L10_Adding_Roles_To_UserAccount.repositories;

import org.maharnur.prathamesh.S35L10_Adding_Roles_To_UserAccount.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
