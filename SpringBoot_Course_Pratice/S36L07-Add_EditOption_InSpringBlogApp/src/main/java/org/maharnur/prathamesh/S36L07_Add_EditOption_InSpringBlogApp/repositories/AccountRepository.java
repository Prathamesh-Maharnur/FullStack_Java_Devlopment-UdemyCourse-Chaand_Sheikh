package org.maharnur.prathamesh.S36L07_Add_EditOption_InSpringBlogApp.repositories;

import java.util.Optional;

import org.maharnur.prathamesh.S36L07_Add_EditOption_InSpringBlogApp.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findOneByEmailIgnoreCase(String email);
}
