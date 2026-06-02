package org.maharnur.prathamesh.S46L02_AuthController_AddUser_API.payload.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {
    private String email;
    private String password;
}
