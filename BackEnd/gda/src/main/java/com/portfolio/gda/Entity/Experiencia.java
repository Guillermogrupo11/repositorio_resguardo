
package com.portfolio.gda.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Size( min = 1, max = 50, message = "no cumple con la longitud")
    private String empresa;
    @NotNull
    @Size( min = 1, max = 50, message = "no cumple con la longitud")
    private String puesto;
    @NotNull
    @Size( min = 1, max = 50, message = "no cumple con la longitud")
    private String años;
}