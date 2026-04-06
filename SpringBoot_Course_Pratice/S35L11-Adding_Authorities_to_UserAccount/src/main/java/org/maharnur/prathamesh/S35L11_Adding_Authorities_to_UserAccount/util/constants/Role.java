package org.maharnur.prathamesh.S35L11_Adding_Authorities_to_UserAccount.util.constants;

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
