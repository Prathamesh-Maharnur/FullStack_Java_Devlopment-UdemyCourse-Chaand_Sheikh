package org.maharnur.prathamesh.S47L05_BuildPhotos_UploadForAlbum.util.constants;

public enum Authority {
    READ,
    WRITE,
    UPDATE,
    DELETE,
    USER, // can update delete self object, read anything
    ADMIN; // can read update delete any object
}
