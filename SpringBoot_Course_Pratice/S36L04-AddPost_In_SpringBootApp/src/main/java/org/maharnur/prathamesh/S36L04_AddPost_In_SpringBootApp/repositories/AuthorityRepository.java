package org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.repositories;

import org.maharnur.prathamesh.S36L04_AddPost_In_SpringBootApp.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
