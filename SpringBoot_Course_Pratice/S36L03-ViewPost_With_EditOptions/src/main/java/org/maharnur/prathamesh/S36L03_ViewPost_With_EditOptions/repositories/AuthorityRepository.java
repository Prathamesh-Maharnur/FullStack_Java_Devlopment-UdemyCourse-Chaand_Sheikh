package org.maharnur.prathamesh.S36L03_ViewPost_With_EditOptions.repositories;

import org.maharnur.prathamesh.S36L03_ViewPost_With_EditOptions.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
