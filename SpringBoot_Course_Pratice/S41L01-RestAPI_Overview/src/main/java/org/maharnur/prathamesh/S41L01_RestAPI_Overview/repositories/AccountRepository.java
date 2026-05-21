package org.maharnur.prathamesh.S41L01_RestAPI_Overview.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S41L01_RestAPI_Overview.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);

    Optional<Account> findByToken(String token);
}
