package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservation();

    public Reservation retrieveReservation(Long reservationId);

    public Reservation addReservation(Reservation r);

    public void removeReservation(Long reservationId);

    public Reservation modifyReservation(Reservation reservation);
}
