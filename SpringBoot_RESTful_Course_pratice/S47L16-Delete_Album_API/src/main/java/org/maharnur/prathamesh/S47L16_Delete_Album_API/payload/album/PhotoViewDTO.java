package org.maharnur.prathamesh.S47L16_Delete_Album_API.payload.album;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PhotoViewDTO {
   
    private long id;

    private String name;

    private String description;
}
