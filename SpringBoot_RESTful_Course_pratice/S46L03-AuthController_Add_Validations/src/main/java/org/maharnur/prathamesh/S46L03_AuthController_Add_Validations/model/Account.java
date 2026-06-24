package org.maharnur.prathamesh.S46L03_AuthController_Add_Validations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Account {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;

    private String email;

    private String password;

    private String role;
}
