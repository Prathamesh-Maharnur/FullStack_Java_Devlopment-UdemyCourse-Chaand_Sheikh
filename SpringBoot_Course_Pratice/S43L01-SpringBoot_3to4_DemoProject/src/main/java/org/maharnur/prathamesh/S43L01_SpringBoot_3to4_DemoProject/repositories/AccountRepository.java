package org.maharnur.prathamesh.S43L01_SpringBoot_3to4_DemoProject.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S43L01_SpringBoot_3to4_DemoProject.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);

    Optional<Account> findByToken(String token);
}
