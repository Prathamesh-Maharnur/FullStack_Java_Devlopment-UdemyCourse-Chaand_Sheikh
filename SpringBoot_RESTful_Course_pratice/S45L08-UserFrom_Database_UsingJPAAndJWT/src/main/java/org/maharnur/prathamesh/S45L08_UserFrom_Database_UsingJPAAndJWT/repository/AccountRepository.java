package org.maharnur.prathamesh.S45L08_UserFrom_Database_UsingJPAAndJWT.repository;

import org.maharnur.prathamesh.S45L08_UserFrom_Database_UsingJPAAndJWT.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
