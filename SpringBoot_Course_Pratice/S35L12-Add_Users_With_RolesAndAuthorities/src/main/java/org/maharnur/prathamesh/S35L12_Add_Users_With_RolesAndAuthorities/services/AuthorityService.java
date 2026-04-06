package org.maharnur.prathamesh.S35L12_Add_Users_With_RolesAndAuthorities.services;

import java.util.Optional;

import org.maharnur.prathamesh.S35L12_Add_Users_With_RolesAndAuthorities.models.Authority;
import org.maharnur.prathamesh.S35L12_Add_Users_With_RolesAndAuthorities.repositories.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {
    
    @Autowired
    private AuthorityRepository authorityRepository;

    public Authority save(Authority authority){
        return authorityRepository.save(authority);
    }

    public Optional<Authority> findById(long id){
        return authorityRepository.findById(id);
    }

}
