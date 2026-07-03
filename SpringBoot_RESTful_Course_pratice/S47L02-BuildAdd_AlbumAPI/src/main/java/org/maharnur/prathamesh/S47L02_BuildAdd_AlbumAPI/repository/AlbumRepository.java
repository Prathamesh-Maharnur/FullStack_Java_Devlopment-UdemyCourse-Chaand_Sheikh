package org.maharnur.prathamesh.S47L02_BuildAdd_AlbumAPI.repository;

import org.maharnur.prathamesh.S47L02_BuildAdd_AlbumAPI.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album,Long>  {
    
}
