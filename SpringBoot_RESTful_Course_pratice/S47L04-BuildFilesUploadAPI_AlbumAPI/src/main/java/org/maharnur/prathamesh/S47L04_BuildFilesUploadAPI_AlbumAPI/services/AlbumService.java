package org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.services;

import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.model.Album;
import org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.payload.auth.AccountViewDTO;
import org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.repository.AccountRepository;
import org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.repository.AlbumRepository;
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
    
}
