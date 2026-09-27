package tn.esprit.Kobbi_Yosr_4Actuariat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Getter
@Setter

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idVehicule;
    private String marque ;
    private String modele ;
    private String immatriculation ;
    private CategoriesVehicule categorie;
    private BigDecimal tarifjouralier;
    @Enumerated(EnumType.STRING) //stock fel base mel 0 1 2 3
    private StatutVehicule statut;

}
