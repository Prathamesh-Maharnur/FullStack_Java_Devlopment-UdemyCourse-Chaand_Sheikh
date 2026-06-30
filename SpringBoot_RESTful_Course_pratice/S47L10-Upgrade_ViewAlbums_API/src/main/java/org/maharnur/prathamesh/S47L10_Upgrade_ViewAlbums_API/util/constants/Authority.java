package org.maharnur.prathamesh.S47L10_Upgrade_ViewAlbums_API.util.constants;

public enum Authority {
    READ,
    WRITE,
    UPDATE,
    DELETE,
    USER, // can update delete self object, read anything
    ADMIN; // can read update delete any object
}
