package org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long>  {
    
    List<Album> findByAccount_id(long id);
}
