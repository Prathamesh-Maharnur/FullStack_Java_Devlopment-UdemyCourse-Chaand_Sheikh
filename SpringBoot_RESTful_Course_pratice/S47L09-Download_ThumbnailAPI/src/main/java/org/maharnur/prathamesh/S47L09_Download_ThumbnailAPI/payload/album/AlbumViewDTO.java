package org.maharnur.prathamesh.S47L09_Download_ThumbnailAPI.payload.album;

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
