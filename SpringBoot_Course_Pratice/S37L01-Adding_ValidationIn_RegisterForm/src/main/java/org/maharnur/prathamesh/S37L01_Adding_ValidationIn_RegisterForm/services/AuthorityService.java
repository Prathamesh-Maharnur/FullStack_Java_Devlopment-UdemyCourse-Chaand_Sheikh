package org.maharnur.prathamesh.S37L01_Adding_ValidationIn_RegisterForm.services;

import java.util.Optional;

import org.maharnur.prathamesh.S37L01_Adding_ValidationIn_RegisterForm.models.Authority;
import org.maharnur.prathamesh.S37L01_Adding_ValidationIn_RegisterForm.repositories.AuthorityRepository;
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
