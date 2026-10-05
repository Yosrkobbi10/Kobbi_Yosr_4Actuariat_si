package tn.esprit.Kobbi_Yosr_4Actuariat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Entity
@Getter
@Setter


public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipement;
    private String libele;

    @ManyToMany(mappedBy= "equipements")
    Set<Vehicule> vehicules;



}
