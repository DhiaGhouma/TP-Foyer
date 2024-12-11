package tn.esprit.springproject.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.repositories.BlocRepository;
import tn.esprit.springproject.repositories.FoyerRepository;


import java.util.List;
@Slf4j
@Service
public class BlocServiceImp implements IblocService {
    @Autowired
    private  BlocRepository blocRepository;
    @Autowired
    private  FoyerRepository foyerRepository;

    @Override
    public  Bloc addbloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updatebloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

   // @Scheduled (cron = "15 * * * * *")

    @Override
    public List<Bloc> retrieveAllbloc()
    {
        List<Bloc> listB = blocRepository.findAll();
        log.info("taille totale :" + listB.size());
        for (Bloc b: listB){
            log.info("Bloc : " + b);
        }
        return blocRepository.findAll();
    }


    @Override
    public Bloc retrieveblocById(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void Deletebloc(long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public Bloc affecterBlocAfoyer(Long idB, Long idF) {
        Bloc bloc = blocRepository.findById(idB).orElse(null);
        Foyer foyer = foyerRepository.findById(idF).orElse(null);
        bloc.setFoyer(foyer); //many to one
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocByCapacite(Long capaciteB) {
        return blocRepository.getBlocByCapacite(capaciteB);
    }
}
