package org.maharnur.prathamesh.S38L01_Adding_ProfilePage.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S38L01_Adding_ProfilePage.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
