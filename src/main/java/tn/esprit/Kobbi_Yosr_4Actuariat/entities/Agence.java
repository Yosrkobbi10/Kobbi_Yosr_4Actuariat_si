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

    @ManyToOne
    private Agence ag;

    @OneToMany (mappedBy = "ags")
    private Set <Vehicule> v2;

    @OneToMany(mappedBy = "a")
    private Set<Employe> SEmployes;


}
