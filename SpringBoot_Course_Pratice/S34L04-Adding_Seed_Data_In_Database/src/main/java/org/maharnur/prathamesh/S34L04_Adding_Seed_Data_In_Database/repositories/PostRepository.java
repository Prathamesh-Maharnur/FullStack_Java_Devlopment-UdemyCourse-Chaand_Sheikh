package org.maharnur.prathamesh.S34L04_Adding_Seed_Data_In_Database.repositories;

import org.maharnur.prathamesh.S34L04_Adding_Seed_Data_In_Database.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
