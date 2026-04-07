package org.maharnur.prathamesh.S35L14_Applications_Has_Bugs.repositories;

import org.maharnur.prathamesh.S35L14_Applications_Has_Bugs.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
