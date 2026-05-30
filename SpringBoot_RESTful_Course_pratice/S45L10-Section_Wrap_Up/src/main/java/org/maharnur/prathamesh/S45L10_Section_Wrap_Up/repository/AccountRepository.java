package org.maharnur.prathamesh.S45L10_Section_Wrap_Up.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S45L10_Section_Wrap_Up.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
