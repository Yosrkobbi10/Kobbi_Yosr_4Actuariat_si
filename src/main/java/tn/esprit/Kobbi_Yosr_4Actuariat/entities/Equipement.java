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


public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipement;
    private String libele;

}
