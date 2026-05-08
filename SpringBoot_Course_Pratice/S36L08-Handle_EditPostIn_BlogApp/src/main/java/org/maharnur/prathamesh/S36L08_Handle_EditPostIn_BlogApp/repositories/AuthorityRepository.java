package org.maharnur.prathamesh.S36L08_Handle_EditPostIn_BlogApp.repositories;

import org.maharnur.prathamesh.S36L08_Handle_EditPostIn_BlogApp.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
