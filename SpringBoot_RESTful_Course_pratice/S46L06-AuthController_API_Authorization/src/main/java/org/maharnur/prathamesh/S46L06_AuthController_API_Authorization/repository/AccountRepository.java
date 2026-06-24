package org.maharnur.prathamesh.S46L06_AuthController_API_Authorization.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S46L06_AuthController_API_Authorization.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
