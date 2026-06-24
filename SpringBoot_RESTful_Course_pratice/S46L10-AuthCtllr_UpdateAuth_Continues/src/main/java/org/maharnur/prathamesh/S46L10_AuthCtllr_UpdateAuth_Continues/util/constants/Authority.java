package org.maharnur.prathamesh.S46L10_AuthCtllr_UpdateAuth_Continues.util.constants;

public enum Authority {
    READ,
    WRITE,
    UPDATE,
    DELETE,
    USER, // can update delete self object, read anything
    ADMIN; // can read update delete any object
}
