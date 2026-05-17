package org.maharnur.prathamesh.S39L06_EmailService_SpringBoot.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S39L06_EmailService_SpringBoot.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
