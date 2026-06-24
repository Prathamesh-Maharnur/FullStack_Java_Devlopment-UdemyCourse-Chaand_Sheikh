package org.maharnur.prathamesh.S46L09_AuthController_UpdateAuthorities.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S46L09_AuthController_UpdateAuthorities.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
