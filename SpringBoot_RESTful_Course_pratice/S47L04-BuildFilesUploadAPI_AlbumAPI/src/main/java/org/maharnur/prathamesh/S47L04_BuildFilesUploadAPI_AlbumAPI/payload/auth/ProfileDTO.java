package org.maharnur.prathamesh.S47L04_BuildFilesUploadAPI_AlbumAPI.payload.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProfileDTO {
    
    private long id; 

    private String email;

    private String authorities;
}
