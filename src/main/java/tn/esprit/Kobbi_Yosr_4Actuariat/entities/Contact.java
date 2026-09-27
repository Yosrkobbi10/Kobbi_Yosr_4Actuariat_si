package tn.esprit.Kobbi_Yosr_4Actuariat.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contact
{ private  long idContrat ;
    private LocalDate datesignature;
    private String prenom;
    private boolean Valide ;

}
