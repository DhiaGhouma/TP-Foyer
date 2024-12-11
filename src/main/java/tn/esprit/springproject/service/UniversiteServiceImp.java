package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.repositories.FoyerRepository;
import tn.esprit.springproject.repositories.UniversiteRepository;


import java.util.List;
@RequiredArgsConstructor
@Service
public class UniversiteServiceImp implements IuniversiteService {

    private final  UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;


    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversiteById(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void DeleteUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

    @Override
    public Universite affecterFoyerUniversite(long idF, long idUniversite) {
        Foyer foyer = foyerRepository.findById(idF).orElse(null);
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }

    @Override
    public Universite desafecterFoyerUniversite(long idUniverste) {
        Universite universite = universiteRepository.findById(idUniverste).orElse(null);
        universite.setFoyer(null);
        return universiteRepository.save(universite);
    }
}
