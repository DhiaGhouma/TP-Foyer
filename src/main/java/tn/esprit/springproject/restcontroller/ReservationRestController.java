package tn.esprit.springproject.restcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Reservation;

import tn.esprit.springproject.service.IreservationService;


import java.time.LocalDate;
import java.util.List;

@RestController
public class ReservationRestController {
    @Autowired
    private IreservationService ireservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {

        return ireservationService.addReservation(reservation);
    }
    @PutMapping("/UpdateReservation")
    public Reservation updateReservation (@RequestBody Reservation reservation){
        return ireservationService.addReservation(reservation);
    }

    @GetMapping("/readReservation")
    public List<Reservation> retrieveAllReservation(){
        return ireservationService.retrieveAllReservation();
    }

    @GetMapping("/retrieveReservationById/{idReservation}")
    public Reservation retrieveReservationById(@PathVariable long idReservation){
        return ireservationService.retrieveReservationById(idReservation);

    }
    @DeleteMapping("/deleteReservation/{idReservation}")
    public void DeleteReservation(@PathVariable long idReservation){
        ireservationService.DeleteReservation(idReservation);
    }
    @GetMapping("/countByDateDebutBetween/{dateDebut}/{DateFin}")
    public Long countByDateDebutBetween(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateDebut, @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  LocalDate DateFin)
    {
        return ireservationService.countByDateDebutBetween(dateDebut,DateFin);

    }


    }
