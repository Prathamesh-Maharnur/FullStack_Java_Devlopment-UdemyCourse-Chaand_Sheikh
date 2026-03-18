package org.maharnur.prathamesh.S35L03_Adding_Register_Account_Form.model;

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
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;

    private String email;

    private String password;

    private String firstname;

    @OneToMany(mappedBy="account")
    List<Post> post;
}
