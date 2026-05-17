package org.maharnur.prathamesh.S39L02_Add_ForgotPassword_View.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S39L02_Add_ForgotPassword_View.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
