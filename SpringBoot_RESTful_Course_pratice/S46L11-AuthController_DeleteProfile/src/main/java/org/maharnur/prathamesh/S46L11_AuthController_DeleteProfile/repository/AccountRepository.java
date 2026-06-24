package org.maharnur.prathamesh.S46L11_AuthController_DeleteProfile.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S46L11_AuthController_DeleteProfile.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
