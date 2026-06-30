package org.maharnur.prathamesh.S47L08_Download_PhotoAPI.services;

import java.util.Optional;

import org.maharnur.prathamesh.S47L08_Download_PhotoAPI.model.Photo;
import org.maharnur.prathamesh.S47L08_Download_PhotoAPI.repository.PhotoRepository;
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
