package org.maharnur.prathamesh.S40L01_AddingPagination_AndSorting.repositories;

import org.maharnur.prathamesh.S40L01_AddingPagination_AndSorting.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
