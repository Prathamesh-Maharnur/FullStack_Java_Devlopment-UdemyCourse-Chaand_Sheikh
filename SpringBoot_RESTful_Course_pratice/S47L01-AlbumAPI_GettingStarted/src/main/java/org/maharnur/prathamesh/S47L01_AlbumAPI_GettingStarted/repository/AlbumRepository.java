package org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.repository;

import org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album,Long>  {
    
}
