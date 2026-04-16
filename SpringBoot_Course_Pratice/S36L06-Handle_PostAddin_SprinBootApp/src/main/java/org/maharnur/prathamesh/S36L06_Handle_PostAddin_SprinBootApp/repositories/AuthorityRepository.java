package org.maharnur.prathamesh.S36L06_Handle_PostAddin_SprinBootApp.repositories;

import org.maharnur.prathamesh.S36L06_Handle_PostAddin_SprinBootApp.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
