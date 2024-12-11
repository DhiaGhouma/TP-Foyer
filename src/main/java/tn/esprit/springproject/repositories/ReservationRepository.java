package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Reservation;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    public Long countByDateDebutBetween(LocalDate dateDebut, LocalDate DateFin);
    List<Reservation> findByDateDebutBefore(LocalDate date);
}
