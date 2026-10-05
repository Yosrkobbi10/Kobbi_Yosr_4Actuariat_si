package tn.esprit.Kobbi_Yosr_4Actuariat.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Reservation;

public interface ReservationRepository extends  JpaRepository<Reservation, Long>{
}
