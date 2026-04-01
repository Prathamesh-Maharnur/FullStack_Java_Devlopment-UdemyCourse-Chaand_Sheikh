package org.maharnur.prathamesh.S35L05_Adding_Spring_Security_Into_Application.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String email;

    private String password;

    private String firstname;

    @OneToMany(mappedBy = "account")
    List<Post> posts;
}
