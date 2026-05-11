package org.maharnur.prathamesh.S37L01_Adding_ValidationIn_RegisterForm.repositories;

import org.maharnur.prathamesh.S37L01_Adding_ValidationIn_RegisterForm.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
