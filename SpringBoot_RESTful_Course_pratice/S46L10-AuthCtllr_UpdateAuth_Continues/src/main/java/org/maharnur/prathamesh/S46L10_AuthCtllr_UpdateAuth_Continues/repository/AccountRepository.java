package org.maharnur.prathamesh.S46L10_AuthCtllr_UpdateAuth_Continues.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S46L10_AuthCtllr_UpdateAuth_Continues.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
