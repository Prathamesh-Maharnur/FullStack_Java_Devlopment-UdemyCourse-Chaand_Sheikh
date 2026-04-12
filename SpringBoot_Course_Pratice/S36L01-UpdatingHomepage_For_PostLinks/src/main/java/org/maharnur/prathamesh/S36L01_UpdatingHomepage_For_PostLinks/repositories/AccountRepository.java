package org.maharnur.prathamesh.S36L01_UpdatingHomepage_For_PostLinks.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S36L01_UpdatingHomepage_For_PostLinks.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
