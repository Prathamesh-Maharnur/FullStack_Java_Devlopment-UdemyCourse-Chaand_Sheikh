package org.maharnur.prathamesh.S37L02_Upgrading_RegistrationForm.repositories;

import org.maharnur.prathamesh.S37L02_Upgrading_RegistrationForm.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
