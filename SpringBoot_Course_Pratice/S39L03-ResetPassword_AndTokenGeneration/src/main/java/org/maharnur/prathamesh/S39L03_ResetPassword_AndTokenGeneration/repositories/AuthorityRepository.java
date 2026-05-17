package org.maharnur.prathamesh.S39L03_ResetPassword_AndTokenGeneration.repositories;

import org.maharnur.prathamesh.S39L03_ResetPassword_AndTokenGeneration.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
