package org.maharnur.prathamesh.S39L07_PasswordChange_In_SpringBoot.repositories;

import org.maharnur.prathamesh.S39L07_PasswordChange_In_SpringBoot.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
