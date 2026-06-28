package org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long>  {
    
    List<Album> findByAccount_id(long id);
}
