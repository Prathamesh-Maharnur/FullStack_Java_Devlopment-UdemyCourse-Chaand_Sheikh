package org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.services;

import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.model.Album;
import org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.repository.AlbumRepository;
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
