package org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.repository;

import org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{
    public Photo save(Photo photo);
}
