package org.maharnur.prathamesh.S43L01_SpringBoot_3to4_DemoProject.repositories;

import org.maharnur.prathamesh.S43L01_SpringBoot_3to4_DemoProject.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
