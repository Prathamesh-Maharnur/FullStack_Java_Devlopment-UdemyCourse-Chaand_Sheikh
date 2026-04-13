package org.maharnur.prathamesh.S36L02_GetPost_From_SpringApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Authority {
    
    @Id
    private Long id;

    private String name;
}
