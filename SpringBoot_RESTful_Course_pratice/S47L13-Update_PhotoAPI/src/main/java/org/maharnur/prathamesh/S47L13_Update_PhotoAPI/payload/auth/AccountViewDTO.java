package org.maharnur.prathamesh.S47L13_Update_PhotoAPI.payload.auth;

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
