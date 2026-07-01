package org.maharnur.prathamesh.S47L12_Update_AlbumAPI.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L12_Update_AlbumAPI.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{
    List<Photo> findByAlbum_id(long id);
}
