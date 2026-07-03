package org.maharnur.prathamesh.S47L12_Update_AlbumAPI.payload.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountViewDTO {

    private long id;

    private String email;

    private String authorities;

}
