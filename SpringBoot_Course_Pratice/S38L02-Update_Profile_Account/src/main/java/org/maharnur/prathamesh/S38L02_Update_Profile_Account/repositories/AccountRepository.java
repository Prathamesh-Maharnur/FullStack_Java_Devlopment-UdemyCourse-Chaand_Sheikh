package org.maharnur.prathamesh.S38L02_Update_Profile_Account.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S38L02_Update_Profile_Account.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
