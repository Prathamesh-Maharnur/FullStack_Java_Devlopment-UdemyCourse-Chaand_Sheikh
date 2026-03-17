package org.maharnur.prathamesh.S34L05_Displaying_Data_On_Webpage_SpringBoot.repositories;

import org.maharnur.prathamesh.S34L05_Displaying_Data_On_Webpage_SpringBoot.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
