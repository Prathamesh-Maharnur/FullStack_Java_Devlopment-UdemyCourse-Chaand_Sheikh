package org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.repositories;

import org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
