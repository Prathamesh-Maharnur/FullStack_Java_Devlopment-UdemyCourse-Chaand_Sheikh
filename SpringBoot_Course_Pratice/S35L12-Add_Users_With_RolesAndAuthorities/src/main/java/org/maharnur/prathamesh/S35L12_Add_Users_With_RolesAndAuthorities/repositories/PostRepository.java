package org.maharnur.prathamesh.S35L12_Add_Users_With_RolesAndAuthorities.repositories;

import org.maharnur.prathamesh.S35L12_Add_Users_With_RolesAndAuthorities.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
