package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface IblocService {
    public Bloc addbloc (Bloc bloc);
    public  Bloc updatebloc (Bloc bloc);
    public List<Bloc> retrieveAllbloc();
    public Bloc retrieveblocById(long idBloc);
    public void Deletebloc(long idBloc);
    public Bloc affecterBlocAfoyer (Long idB, Long idF);
    public Bloc getBlocByCapacite(Long capaciteB);

}
