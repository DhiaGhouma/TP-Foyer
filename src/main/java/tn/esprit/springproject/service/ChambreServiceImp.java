package tn.esprit.springproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;
import tn.esprit.springproject.repositories.BlocRepository;
import tn.esprit.springproject.repositories.ChambreRepository;


import java.util.List;

@Service
public class ChambreServiceImp implements IchambreService {
    @Autowired
    private ChambreRepository chambreRepository;
    @Autowired
    private BlocRepository blocRepository;

    @Override
    public Chambre addchambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updatechambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> retrieveAllchambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrievechambreById(long idC) {
        return chambreRepository.findById(idC).orElse(null);
    }

    @Override
    public void Deletechambre(long idC) {
        chambreRepository.deleteById(idC);

    }

    @Override
    public Bloc affecterChambresBloc(List<Long> idC, long idB) {
        Bloc bloc = blocRepository.findById(idB).orElse(null);
        List<Chambre> chambreList= chambreRepository.findAllById(idC);
        for (Chambre chambre : chambreList)
        {
            chambre.setBloc(bloc);

        }
        chambreRepository.saveAll(chambreList);
        return bloc;
    }

    @Override
    public List<Chambre> findByBloc_IdBlocAndTypeC(Long idBloc, TypeChambre tc) {
        return chambreRepository.getChambreByBlocAndType(idBloc,tc);
    }
}
