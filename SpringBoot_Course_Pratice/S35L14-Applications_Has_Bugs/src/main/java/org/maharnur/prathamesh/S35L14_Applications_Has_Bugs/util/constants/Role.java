package org.maharnur.prathamesh.S35L14_Applications_Has_Bugs.util.constants;

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
