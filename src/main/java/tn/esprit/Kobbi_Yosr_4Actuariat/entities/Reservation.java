package tn.esprit.Kobbi_Yosr_4Actuariat.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumeratedValue;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Reservation {
    private long idReservation;
    private LocalDate dateDebut;
    private String dateFin;
    @Enumerated(EnumType.STRING)
    private  StatutResevation statut;


}
