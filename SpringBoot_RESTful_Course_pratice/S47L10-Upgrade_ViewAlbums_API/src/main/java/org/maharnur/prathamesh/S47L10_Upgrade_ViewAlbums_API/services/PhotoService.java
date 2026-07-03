package org.maharnur.prathamesh.S47L10_Upgrade_ViewAlbums_API.services;

import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S47L10_Upgrade_ViewAlbums_API.model.Photo;
import org.maharnur.prathamesh.S47L10_Upgrade_ViewAlbums_API.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
    
    @Autowired
    private PhotoRepository photoRepository;

    public Photo save(Photo photo){
        return photoRepository.save(photo);
    }

    public Optional<Photo> findById(long id){
        return photoRepository.findById(id);
    }

    public List<Photo> findByAlbum_id(long id){
        return photoRepository.findByAlbum_id(id);
    }
}
