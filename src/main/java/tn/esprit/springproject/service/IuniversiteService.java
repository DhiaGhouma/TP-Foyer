package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Universite;

import java.util.List;

public interface IuniversiteService {
    public Universite addUniversite (Universite universite);
    public Universite updateUniversite (Universite universite);
    public List<Universite> retrieveAllUniversite();
    public Universite retrieveUniversiteById(long idUniversite);
    public void DeleteUniversite(long idUniversite);
    public Universite affecterFoyerUniversite (long idf,long idUniversite);
    public Universite desafecterFoyerUniversite (long idUniverste);


}
