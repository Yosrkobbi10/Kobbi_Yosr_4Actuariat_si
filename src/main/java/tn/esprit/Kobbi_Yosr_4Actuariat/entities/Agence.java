package tn.esprit.Kobbi_Yosr_4Actuariat.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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



}
