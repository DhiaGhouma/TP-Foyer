package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;

import java.util.List;

public interface IchambreService {
    public Chambre addchambre (Chambre chambre);
    public Chambre updatechambre (Chambre chambre);
    public List<Chambre> retrieveAllchambre();
    public Chambre retrievechambreById(long idC);
    public void Deletechambre(long idC);
    public Bloc affecterChambresBloc (List <Long> idC, long idB);
    public List<Chambre> findByBloc_IdBlocAndTypeC(Long idBloc, TypeChambre tc);
}
