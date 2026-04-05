package org.maharnur.prathamesh.S35L08_Update_WebTemplate__ThymeLeafTags.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S35L08_Update_WebTemplate__ThymeLeafTags.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
