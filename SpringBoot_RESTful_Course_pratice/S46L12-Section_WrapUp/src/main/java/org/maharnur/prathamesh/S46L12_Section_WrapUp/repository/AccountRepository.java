package org.maharnur.prathamesh.S46L12_Section_WrapUp.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S46L12_Section_WrapUp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
