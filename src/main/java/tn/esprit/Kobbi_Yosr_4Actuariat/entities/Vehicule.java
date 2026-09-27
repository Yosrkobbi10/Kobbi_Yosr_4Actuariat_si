package tn.esprit.Kobbi_Yosr_4Actuariat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVehicule;

    private String marque;
    private String modele;
    private String immatriculation;

    @Enumerated(EnumType.STRING)
    private CategoriesVehicule categorie;

    private BigDecimal tarifjouralier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
}