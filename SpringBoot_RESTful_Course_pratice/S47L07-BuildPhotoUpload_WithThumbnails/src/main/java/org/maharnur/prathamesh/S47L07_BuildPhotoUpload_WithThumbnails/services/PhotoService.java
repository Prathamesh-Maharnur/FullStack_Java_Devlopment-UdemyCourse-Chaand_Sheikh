package org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.services;

import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.model.Photo;
import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
    
    @Autowired
    private PhotoRepository photoRepository;

    public Photo save(Photo photo){
        return photoRepository.save(photo);
    }
}
