package tn.esprit.Kobbi_Yosr_4Actuariat.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgence;
    private String nom;
    private String ville;
    private String addresse;
    private String telephone;



    @OneToMany (mappedBy = "agence")
    private Set <Vehicule> vehicules;


    //agence--employee
    @OneToMany(mappedBy = "agence")
    private Set<Employe> employes;


}
