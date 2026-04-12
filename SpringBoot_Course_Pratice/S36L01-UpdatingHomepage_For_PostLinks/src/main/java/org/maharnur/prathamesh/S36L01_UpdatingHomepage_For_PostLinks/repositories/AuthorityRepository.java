package org.maharnur.prathamesh.S36L01_UpdatingHomepage_For_PostLinks.repositories;

import org.maharnur.prathamesh.S36L01_UpdatingHomepage_For_PostLinks.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
