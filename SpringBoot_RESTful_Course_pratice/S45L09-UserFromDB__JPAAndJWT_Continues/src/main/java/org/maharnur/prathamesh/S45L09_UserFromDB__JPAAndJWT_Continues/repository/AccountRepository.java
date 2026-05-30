package org.maharnur.prathamesh.S45L09_UserFromDB__JPAAndJWT_Continues.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S45L09_UserFromDB__JPAAndJWT_Continues.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
