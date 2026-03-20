package org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.repositories;

import org.maharnur.prathamesh.S35L04_Adding_Login_User_Form.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
