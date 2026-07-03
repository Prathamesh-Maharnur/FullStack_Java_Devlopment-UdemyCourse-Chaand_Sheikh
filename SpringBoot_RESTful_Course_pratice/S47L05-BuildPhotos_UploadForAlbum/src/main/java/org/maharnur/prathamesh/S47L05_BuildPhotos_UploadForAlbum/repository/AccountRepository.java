package org.maharnur.prathamesh.S47L05_BuildPhotos_UploadForAlbum.repository;

import java.util.Optional;

import org.maharnur.prathamesh.S47L05_BuildPhotos_UploadForAlbum.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByEmail(String email);
}
