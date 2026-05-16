package org.maharnur.prathamesh.S39L04_SendingEmail_For_PasswordReset.repositories;

import org.maharnur.prathamesh.S39L04_SendingEmail_For_PasswordReset.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
