package org.maharnur.prathamesh.S46L03_AuthController_Add_Validations.payload.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {

    @Email
    @Schema(description = "Email address", example = "prathamesh@gmail.com", requiredMode = RequiredMode.REQUIRED)
    private String email;

    @Size(min = 6, max = 20)
    @Schema(description = "Password", example = "Password", requiredMode = RequiredMode.REQUIRED, minLength = 6, maxLength = 20)
    private String password;
    
}
