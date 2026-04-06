package org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.repositories;

import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
