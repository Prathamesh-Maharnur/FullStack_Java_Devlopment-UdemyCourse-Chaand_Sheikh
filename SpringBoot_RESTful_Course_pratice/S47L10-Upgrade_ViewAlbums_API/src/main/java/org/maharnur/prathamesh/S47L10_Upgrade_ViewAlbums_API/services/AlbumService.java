package org.maharnur.prathamesh.S47L10_Upgrade_ViewAlbums_API.services;

import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S47L10_Upgrade_ViewAlbums_API.model.Album;
import org.maharnur.prathamesh.S47L10_Upgrade_ViewAlbums_API.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {
    
    @Autowired
    private AlbumRepository albumRepository;


    public Album save(Album album){
        return albumRepository.save(album);
    }

    public List<Album> findByAccount_id(long id){
        return albumRepository.findByAccount_id(id);
    }
    
    public Optional<Album> findById(long id){
        return albumRepository.findById(id);
    }
}
