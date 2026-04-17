package org.maharnur.prathamesh.S36L07_Add_EditOption_InSpringBlogApp.repositories;

import org.maharnur.prathamesh.S36L07_Add_EditOption_InSpringBlogApp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
