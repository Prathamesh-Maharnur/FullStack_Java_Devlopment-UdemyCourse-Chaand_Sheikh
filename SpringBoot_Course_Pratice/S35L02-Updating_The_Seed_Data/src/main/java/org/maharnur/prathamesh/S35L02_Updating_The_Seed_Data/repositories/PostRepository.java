package org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.repositories;

import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
}
