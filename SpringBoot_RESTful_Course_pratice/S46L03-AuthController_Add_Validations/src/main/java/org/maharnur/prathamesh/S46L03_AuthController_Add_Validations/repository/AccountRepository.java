package org.maharnur.prathamesh.S46L03_AuthController_Add_Validations.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S46L03_AuthController_Add_Validations.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
