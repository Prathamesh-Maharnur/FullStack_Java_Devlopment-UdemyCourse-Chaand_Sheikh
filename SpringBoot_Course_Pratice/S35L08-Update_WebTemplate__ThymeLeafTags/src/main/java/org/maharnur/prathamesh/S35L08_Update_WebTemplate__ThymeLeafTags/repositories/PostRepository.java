package org.maharnur.prathamesh.S35L08_Update_WebTemplate__ThymeLeafTags.repositories;

import org.maharnur.prathamesh.S35L08_Update_WebTemplate__ThymeLeafTags.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
