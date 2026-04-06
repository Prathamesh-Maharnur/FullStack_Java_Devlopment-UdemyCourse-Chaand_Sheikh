package org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.services;

import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.models.Authority;
import org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.repositories.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {
    
    @Autowired
    private AuthorityRepository authorityRepository;

    public Authority save(Authority authority){
        return authorityRepository.save(authority);
    }

}
