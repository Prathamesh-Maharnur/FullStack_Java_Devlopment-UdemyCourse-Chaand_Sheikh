package org.maharnur.prathamesh.S39L07_PasswordChange_In_SpringBoot.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S39L07_PasswordChange_In_SpringBoot.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);

    Optional<Account> findByToken(String token);
}
