package org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.repositories;

import org.maharnur.prathamesh.S35L02_Updating_The_Seed_Data.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
