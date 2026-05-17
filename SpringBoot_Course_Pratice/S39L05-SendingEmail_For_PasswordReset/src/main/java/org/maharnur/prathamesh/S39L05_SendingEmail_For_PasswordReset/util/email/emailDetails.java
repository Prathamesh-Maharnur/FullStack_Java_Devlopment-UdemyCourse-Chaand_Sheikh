package org.maharnur.prathamesh.S39L05_SendingEmail_For_PasswordReset.util.email;

import lombok.Data;

@Data
public class emailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
}
