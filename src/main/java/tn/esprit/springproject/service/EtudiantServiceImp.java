package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.repositories.EtudiantRepository;


import java.util.List;

@Service
public class EtudiantServiceImp implements IetudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiantById(long idE) {
        return etudiantRepository.findById(idE).orElse(null);
    }

    @Override
    public void DeleteEtudiant(long idE) {
        etudiantRepository.deleteById(idE);

    }
}
