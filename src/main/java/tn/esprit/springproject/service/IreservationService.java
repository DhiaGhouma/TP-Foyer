package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IreservationService {
    public Reservation addReservation(Reservation reservation);
    public Reservation updateReservation (Reservation reservation);
    public List<Reservation> retrieveAllReservation();
    public Reservation retrieveReservationById(long idReservation);
    public void DeleteReservation(long idReservation);
    public Long countByDateDebutBetween(LocalDate dateDebut, LocalDate DateFin);
}
