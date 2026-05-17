package org.maharnur.prathamesh.S39L04_SendingEmail_For_PasswordReset.util.constants;

public enum Role {

    USER("ROLE_USER"), ADMIN("ROLE_ADMIN"), EDITOR("ROLE_EDITOR");

    private String role;

    private Role(String role){
         this.role=role;
    }

    public String getRole(){
        return role;
    }
}
