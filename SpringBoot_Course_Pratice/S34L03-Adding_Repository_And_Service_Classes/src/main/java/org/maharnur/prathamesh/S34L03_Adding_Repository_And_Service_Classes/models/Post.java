package org.maharnur.prathamesh.S34L03_Adding_Repository_And_Service_Classes.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
    
    @Id
    @GeneratedValue
    Long Id;

    private String title;

    @Column(columnDefinition="TEXT")
    private String body;

    private LocalDateTime createdAt;
}
