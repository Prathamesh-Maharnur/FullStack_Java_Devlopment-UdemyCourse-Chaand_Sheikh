package org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S47L03_BuildList_AlbumAPI.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
