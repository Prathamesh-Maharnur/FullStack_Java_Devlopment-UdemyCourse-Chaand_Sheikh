package org.maharnur.prathamesh.S35L12_Add_Users_With_RolesAndAuthorities.repositories;

import org.maharnur.prathamesh.S35L12_Add_Users_With_RolesAndAuthorities.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
