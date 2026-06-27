package org.maharnur.prathamesh.S47L05_BuildPhotos_UploadForAlbum.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Account {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;

    private String email;

    private String password;

    private String Authorities;
}
