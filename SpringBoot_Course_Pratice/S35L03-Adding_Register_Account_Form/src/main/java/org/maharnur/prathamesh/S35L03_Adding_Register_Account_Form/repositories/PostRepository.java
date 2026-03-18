package org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.repositories;

import org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
}
