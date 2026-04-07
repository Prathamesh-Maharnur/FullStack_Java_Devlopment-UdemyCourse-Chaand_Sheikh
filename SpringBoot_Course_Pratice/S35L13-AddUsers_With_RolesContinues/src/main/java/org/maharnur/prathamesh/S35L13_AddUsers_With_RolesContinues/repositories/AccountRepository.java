package org.maharnur.prathamesh.S35L13_AddUsers_With_RolesContinues.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S35L13_AddUsers_With_RolesContinues.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
