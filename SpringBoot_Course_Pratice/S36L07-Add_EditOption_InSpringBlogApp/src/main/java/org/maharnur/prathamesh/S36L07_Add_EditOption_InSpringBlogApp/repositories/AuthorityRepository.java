package org.maharnur.prathamesh.S36L07_Add_EditOption_InSpringBlogApp.repositories;

import org.maharnur.prathamesh.S36L07_Add_EditOption_InSpringBlogApp.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
