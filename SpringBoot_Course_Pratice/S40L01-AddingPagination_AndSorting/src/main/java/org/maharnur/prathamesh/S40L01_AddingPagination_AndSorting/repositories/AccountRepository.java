package org.maharnur.prathamesh.S40L01_AddingPagination_AndSorting.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S40L01_AddingPagination_AndSorting.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);

    Optional<Account> findByToken(String token);
}
