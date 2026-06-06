package org.maharnur.prathamesh.S46L08_AuthController_Update_Password.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S46L08_AuthController_Update_Password.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
