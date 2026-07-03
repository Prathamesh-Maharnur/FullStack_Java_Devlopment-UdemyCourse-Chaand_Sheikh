package org.maharnur.prathamesh.S47L11_BuildView_AlbumById_API.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L11_BuildView_AlbumById_API.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long>  {
    
    List<Album> findByAccount_id(long id);
}
