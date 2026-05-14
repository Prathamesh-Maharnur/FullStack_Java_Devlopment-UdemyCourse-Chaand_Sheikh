package org.maharnur.prathamesh.S38L03_Update_ProfilePhoto_InApp.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S38L03_Update_ProfilePhoto_InApp.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
