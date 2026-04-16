package org.maharnur.prathamesh.S36L06_Handle_PostAddin_SprinBootApp.repositories;

import org.maharnur.prathamesh.S36L06_Handle_PostAddin_SprinBootApp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
