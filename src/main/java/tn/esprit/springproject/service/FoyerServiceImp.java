package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.repositories.FoyerRepository;
import tn.esprit.springproject.repositories.UniversiteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class FoyerServiceImp implements IfoyerService{
    private FoyerRepository foyerRepository;
    private UniversiteRepository universiteRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {

        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> retrieveAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyerById(long idF) {
        return foyerRepository.findById(idF).orElse(null);
    }

    @Override
    public void DeleteFoyer(long idF) {
        foyerRepository.deleteById(idF);

    }

    @Override
    public Foyer addFoyerandAffectTouniversite(Foyer foyer, Long idU) {
       Universite universite = universiteRepository.findById(idU).orElse(null);
       for (Bloc bloc : foyer.getBlocs() )
       {
           bloc.setFoyer(foyer);
       }
       Foyer savedFoyer = foyerRepository.save(foyer);
       foyer.setUniversite(universite);
       universite.setFoyer(savedFoyer);
       universiteRepository.save(universite);
    return savedFoyer;
    }

    @Override
    public Foyer getFoyerByNom(String NomF) {
        return foyerRepository.findByNomF(NomF);
    }
}
