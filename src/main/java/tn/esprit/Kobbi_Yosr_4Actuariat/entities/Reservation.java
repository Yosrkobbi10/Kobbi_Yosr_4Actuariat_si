package tn.esprit.Kobbi_Yosr_4Actuariat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;

    private LocalDate dateDebut;
    private String dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;


    @OneToOne
    private Contrat cont ;

    @ManyToOne
    private Vehicule v ;

    @ManyToOne
    private Client c ;
}