package org.maharnur.prathamesh.S46L12_Section_WrapUp.util.constants;

public enum Authority {
    READ,
    WRITE,
    UPDATE,
    DELETE,
    USER, // can update delete self object, read anything
    ADMIN; // can read update delete any object
}
