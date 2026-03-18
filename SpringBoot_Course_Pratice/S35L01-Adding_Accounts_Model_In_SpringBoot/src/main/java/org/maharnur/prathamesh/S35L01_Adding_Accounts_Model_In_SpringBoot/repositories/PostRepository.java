package org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.repositories;

import org.maharnur.prathamesh.S35L01_Adding_Accounts_Model_In_SpringBoot.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
}
