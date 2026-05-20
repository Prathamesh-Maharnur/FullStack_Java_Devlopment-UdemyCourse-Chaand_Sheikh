package org.maharnur.prathamesh.S40L02_PaginationAnd_Sorting_WrapUp.services;

import java.util.Optional;

import org.maharnur.prathamesh.S40L02_PaginationAnd_Sorting_WrapUp.models.Authority;
import org.maharnur.prathamesh.S40L02_PaginationAnd_Sorting_WrapUp.repositories.AuthorityRepository;
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
