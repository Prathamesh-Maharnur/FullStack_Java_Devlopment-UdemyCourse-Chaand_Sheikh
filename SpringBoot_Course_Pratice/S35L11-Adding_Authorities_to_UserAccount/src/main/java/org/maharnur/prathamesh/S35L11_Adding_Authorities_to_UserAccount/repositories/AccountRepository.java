package org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
