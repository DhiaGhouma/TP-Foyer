package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface IetudiantService {
    public Etudiant addEtudiant (Etudiant etudiant);
    public Etudiant updateEtudiant (Etudiant etudiant);
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiantById(long idE);
    public void DeleteEtudiant(long idE);
}
