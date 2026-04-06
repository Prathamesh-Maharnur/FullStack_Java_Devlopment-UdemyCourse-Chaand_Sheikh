package org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.repositories;

import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
