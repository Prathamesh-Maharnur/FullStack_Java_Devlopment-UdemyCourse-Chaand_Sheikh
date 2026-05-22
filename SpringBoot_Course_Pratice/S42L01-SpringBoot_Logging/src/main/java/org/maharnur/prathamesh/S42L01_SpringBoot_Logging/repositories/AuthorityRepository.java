package org.maharnur.prathamesh.S42L01_SpringBoot_Logging.repositories;

import org.maharnur.prathamesh.S42L01_SpringBoot_Logging.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
