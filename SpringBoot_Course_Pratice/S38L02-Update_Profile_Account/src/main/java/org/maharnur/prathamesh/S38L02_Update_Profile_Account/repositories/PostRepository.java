package org.maharnur.prathamesh.S38L02_Update_Profile_Account.repositories;

import org.maharnur.prathamesh.S38L02_Update_Profile_Account.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
