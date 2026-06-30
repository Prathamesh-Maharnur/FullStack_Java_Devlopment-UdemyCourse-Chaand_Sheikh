package org.maharnur.prathamesh.S47L09_Download_ThumbnailAPI.services;

import java.util.Optional;

import org.maharnur.prathamesh.S47L09_Download_ThumbnailAPI.model.Photo;
import org.maharnur.prathamesh.S47L09_Download_ThumbnailAPI.repository.PhotoRepository;
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
}
