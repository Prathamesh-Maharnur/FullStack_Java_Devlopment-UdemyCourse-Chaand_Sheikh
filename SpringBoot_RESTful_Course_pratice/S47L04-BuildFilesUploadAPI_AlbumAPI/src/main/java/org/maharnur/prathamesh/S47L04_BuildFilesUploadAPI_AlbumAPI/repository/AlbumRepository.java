package org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album,Long>  {
    
    List<Album> findByAccount_id(long id);
}
