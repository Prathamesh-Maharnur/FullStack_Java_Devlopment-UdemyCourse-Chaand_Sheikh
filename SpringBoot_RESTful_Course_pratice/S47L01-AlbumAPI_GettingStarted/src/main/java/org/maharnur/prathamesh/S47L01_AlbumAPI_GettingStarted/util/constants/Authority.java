package org.maharnur.prathamesh.S47L01_AlbumAPI_GettingStarted.util.constants;

public enum Authority {
    READ,
    WRITE,
    UPDATE,
    DELETE,
    USER, // can update delete self object, read anything
    ADMIN; // can read update delete any object
}
