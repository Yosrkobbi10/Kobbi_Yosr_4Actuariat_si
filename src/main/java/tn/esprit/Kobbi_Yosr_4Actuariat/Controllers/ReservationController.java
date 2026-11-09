package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Reservation;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final IReservationService reservationService;

    public ReservationController(IReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/ajouterReservation")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.modifyReservation(reservation);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.removeReservation(id);
    }

    @GetMapping("/getById/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationService.retrieveReservation(id);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservation();
    }
}
