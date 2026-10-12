package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Reservation;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.ReservationRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IReservationService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServicelmpl implements IReservationService {
    ReservationRepository reservationRepository;

    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    public Reservation retrieveReservation(Long reservationId) {
        return reservationRepository.findById(reservationId).get();
    }

    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    public void removeReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
