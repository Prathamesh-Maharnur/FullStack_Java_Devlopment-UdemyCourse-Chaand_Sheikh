package org.maharnur.prathamesh.S35L13_AddUsers_With_RolesContinues.repositories;

import org.maharnur.prathamesh.S35L13_AddUsers_With_RolesContinues.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
