package org.maharnur.prathamesh.S40L02_PaginationAnd_Sorting_WrapUp.repositories;

import org.maharnur.prathamesh.S40L02_PaginationAnd_Sorting_WrapUp.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
