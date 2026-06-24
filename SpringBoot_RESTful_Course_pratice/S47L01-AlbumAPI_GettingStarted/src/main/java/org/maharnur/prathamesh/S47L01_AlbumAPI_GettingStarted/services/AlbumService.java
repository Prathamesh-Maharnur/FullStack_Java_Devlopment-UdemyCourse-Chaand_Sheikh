package org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.services;

import java.util.Optional;

import org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.model.Album;
import org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {
    
    @Autowired
    private AlbumRepository albumRepository;

    public Album save(Album album){
        return albumRepository.save(album);
    }
}
