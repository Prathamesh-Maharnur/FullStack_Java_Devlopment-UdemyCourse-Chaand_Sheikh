package org.maharnur.prathamesh.S34L02_Adding_Models_In_SpringBoot.models;

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
    private Long id;

    private String title;

    @Column(columnDefinition="TEXT")
    private String body;

    private LocalDateTime createdAt;

}
