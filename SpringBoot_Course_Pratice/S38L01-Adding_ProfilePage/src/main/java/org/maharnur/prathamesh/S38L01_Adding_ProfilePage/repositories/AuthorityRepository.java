package org.maharnur.prathamesh.S38L01_Adding_ProfilePage.repositories;

import org.maharnur.prathamesh.S38L01_Adding_ProfilePage.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
