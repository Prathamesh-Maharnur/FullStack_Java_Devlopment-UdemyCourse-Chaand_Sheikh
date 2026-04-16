package org.maharnur.prathamesh.S36L06_Handle_PostAddin_SprinBootApp.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S36L06_Handle_PostAddin_SprinBootApp.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
