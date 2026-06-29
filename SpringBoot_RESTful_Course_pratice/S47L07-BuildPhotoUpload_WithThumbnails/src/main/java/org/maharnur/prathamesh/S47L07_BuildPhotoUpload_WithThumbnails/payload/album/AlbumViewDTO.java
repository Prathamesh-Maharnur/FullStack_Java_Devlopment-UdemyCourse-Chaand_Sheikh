package org.maharnur.prathamesh.S47L07_BuildPhotoUpload_WithThumbnails.payload.album;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AlbumViewDTO {
    
    private long id;

    private String name;

    private String description;
}
