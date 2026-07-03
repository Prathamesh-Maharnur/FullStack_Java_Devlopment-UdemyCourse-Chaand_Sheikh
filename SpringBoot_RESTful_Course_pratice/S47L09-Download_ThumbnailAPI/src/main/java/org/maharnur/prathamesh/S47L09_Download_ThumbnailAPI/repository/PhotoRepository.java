package org.maharnur.prathamesh.S47L09_Download_ThumbnailAPI.repository;

import org.maharnur.prathamesh.S47L09_Download_ThumbnailAPI.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{
    public Photo save(Photo photo);
}
