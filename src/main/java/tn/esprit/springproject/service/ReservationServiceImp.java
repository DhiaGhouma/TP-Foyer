package tn.esprit.springproject.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.repositories.ReservationRepository;


import java.time.LocalDate;
import java.util.List;
@Service
@Slf4j
public class ReservationServiceImp implements IreservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservationById(long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void DeleteReservation(long idReservation) {
        reservationRepository.deleteById(idReservation);

    }

    @Override
    public Long countByDateDebutBetween(LocalDate dateDebut, LocalDate DateFin) {
        return  reservationRepository.countByDateDebutBetween(dateDebut,DateFin);
    }
    @Scheduled(fixedRate = 50000)
    public void mettreAJourEtAfficherReservations() {
        LocalDate dateLimite = LocalDate.of(2024, 1, 1);
        List<Reservation> reservations = reservationRepository.findByDateDebutBefore(dateLimite);
        for (Reservation reservation : reservations) {
            reservation.setEstValide(false);
            reservationRepository.save(reservation);
        }
        List<Reservation> allReservations = reservationRepository.findAll();
        allReservations.forEach(reservation -> {
            System.out.println(reservation);
        });
    }
}

