package org.maharnur.prathamesh.S47L13_Update_PhotoAPI.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L13_Update_PhotoAPI.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{
    List<Photo> findByAlbum_id(long id);
}
