package org.maharnur.prathamesh.S39L06_EmailService_SpringBoot.repositories;

import org.maharnur.prathamesh.S39L06_EmailService_SpringBoot.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
