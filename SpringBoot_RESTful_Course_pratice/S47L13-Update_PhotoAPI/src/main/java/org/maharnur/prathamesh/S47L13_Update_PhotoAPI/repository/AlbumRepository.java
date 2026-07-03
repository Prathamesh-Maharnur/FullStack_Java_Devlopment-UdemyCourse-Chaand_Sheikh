package org.maharnur.prathamesh.S47L13_Update_PhotoAPI.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L13_Update_PhotoAPI.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long>  {
    
    List<Album> findByAccount_id(long id);
}
