package org.maharnur.prathamesh.S47L13_Update_PhotoAPI.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S47L13_Update_PhotoAPI.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
