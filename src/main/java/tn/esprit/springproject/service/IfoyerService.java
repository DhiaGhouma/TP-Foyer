package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface IfoyerService {
    public Foyer addFoyer(Foyer foyer);
    public Foyer updateFoyer (Foyer foyer);
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyerById(long idF);
    public void DeleteFoyer(long idF);
    public Foyer addFoyerandAffectTouniversite(Foyer foyer , Long idU);
    public Foyer getFoyerByNom (String NomF);
}
