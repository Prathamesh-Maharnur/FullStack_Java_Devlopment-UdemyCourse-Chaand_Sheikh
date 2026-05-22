package org.maharnur.prathamesh.S43L02_SpringBoot4_Section_WrapUp.repositories;

import org.maharnur.prathamesh.S43L02_SpringBoot4_Section_WrapUp.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
