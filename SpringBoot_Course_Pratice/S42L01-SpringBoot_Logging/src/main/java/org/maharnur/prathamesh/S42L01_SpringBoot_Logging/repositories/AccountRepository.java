package org.maharnur.prathamesh.S42L01_SpringBoot_Logging.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S42L01_SpringBoot_Logging.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);

    Optional<Account> findByToken(String token);
}
