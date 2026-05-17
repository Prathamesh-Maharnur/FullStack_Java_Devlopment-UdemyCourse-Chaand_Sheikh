package org.maharnur.prathamesh.S39L05_SendingEmail_For_PasswordReset.util.constants;

public enum Privileges {
    RESET_ANY_USER_PASSWORD(1l, "RESET_ANY_USER_PASSWORD"),
    ACCESS_ADMIN_PANEL(2l, "ACCESS_ADMIN_PANEL");

    private Long id;

    private String privilege;

    private Privileges(Long id, String privilege){
        this.id = id;
        this.privilege = privilege;
    }

    public Long getId(){
        return id;
    }

    public String getPrivilege(){
        return privilege;
    }
}
