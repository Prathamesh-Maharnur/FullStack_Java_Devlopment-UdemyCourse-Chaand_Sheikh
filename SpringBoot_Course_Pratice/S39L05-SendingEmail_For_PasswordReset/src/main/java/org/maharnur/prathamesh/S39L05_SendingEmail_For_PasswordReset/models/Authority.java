package org.maharnur.prathamesh.S39L05_SendingEmail_For_PasswordReset.models;

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
