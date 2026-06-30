package org.maharnur.prathamesh.S47L08_Download_PhotoAPI.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S47L08_Download_PhotoAPI.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
