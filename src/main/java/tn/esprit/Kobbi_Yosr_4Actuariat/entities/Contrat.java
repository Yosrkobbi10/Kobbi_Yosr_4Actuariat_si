package tn.esprit.Kobbi_Yosr_4Actuariat.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;

    private LocalDate datesignature;
    private String prenom;
    private boolean Valide;

    @OneToOne(mappedBy="contrat")
    private Reservation reservation;
}