package org.maharnur.prathamesh.S41L01_RestAPI_Overview.services;

import java.util.Optional;

import org.maharnur.prathamesh.S41L01_RestAPI_Overview.models.Authority;
import org.maharnur.prathamesh.S41L01_RestAPI_Overview.repositories.AuthorityRepository;
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
