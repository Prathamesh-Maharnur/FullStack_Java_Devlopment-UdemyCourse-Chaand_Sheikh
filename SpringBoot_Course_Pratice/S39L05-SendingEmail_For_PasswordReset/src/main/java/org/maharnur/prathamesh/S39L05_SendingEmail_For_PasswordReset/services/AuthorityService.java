package org.maharnur.prathamesh.S39L05_SendingEmail_For_PasswordReset.services;

import java.util.Optional;

import org.maharnur.prathamesh.S39L05_SendingEmail_For_PasswordReset.models.Authority;
import org.maharnur.prathamesh.S39L05_SendingEmail_For_PasswordReset.repositories.AuthorityRepository;
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
