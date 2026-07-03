package org.maharnur.prathamesh.S47L14_Upgrading_The_Project.services;

import java.util.List;
import java.util.Optional;

import org.maharnur.prathamesh.S47L14_Upgrading_The_Project.model.Photo;
import org.maharnur.prathamesh.S47L14_Upgrading_The_Project.repository.PhotoRepository;
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
