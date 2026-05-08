package org.maharnur.prathamesh.S36L10_Adding_WarningModel_ForDelete.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S36L10_Adding_WarningModel_ForDelete.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
