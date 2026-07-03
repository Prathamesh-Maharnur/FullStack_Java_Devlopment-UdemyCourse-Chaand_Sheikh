package org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.services;

import org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.model.Photo;
import org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.repository.PhotoRepository;
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
