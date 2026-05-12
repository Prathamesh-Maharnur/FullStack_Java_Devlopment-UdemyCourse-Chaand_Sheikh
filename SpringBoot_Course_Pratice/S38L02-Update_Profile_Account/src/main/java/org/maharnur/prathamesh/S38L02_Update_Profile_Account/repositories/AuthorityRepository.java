package org.maharnur.prathamesh.S38L02_Update_Profile_Account.repositories;

import org.maharnur.prathamesh.S38L02_Update_Profile_Account.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
