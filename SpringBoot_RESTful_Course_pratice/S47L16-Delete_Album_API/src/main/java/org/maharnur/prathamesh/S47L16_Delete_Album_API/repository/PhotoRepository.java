package org.maharnur.prathamesh.S47L16_Delete_Album_API.repository;

import java.util.List;

import org.maharnur.prathamesh.S47L16_Delete_Album_API.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long>{
    List<Photo> findByAlbum_id(long id);
}
