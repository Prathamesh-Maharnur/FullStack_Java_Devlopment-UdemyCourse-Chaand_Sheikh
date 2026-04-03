package org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S35L07_SecurityLogin_LoadUserByUsername.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
