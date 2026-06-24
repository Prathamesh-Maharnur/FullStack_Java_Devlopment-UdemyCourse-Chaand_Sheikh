package org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
