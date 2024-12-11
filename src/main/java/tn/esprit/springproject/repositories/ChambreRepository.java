package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    //withKeyWord
    //public List<Chambre> findByBloc_IdBlocAndTypeC(Long idBloc, TypeChambre tc);
    //WithJPQuery
    @Query("select c from Chambre c where c.bloc.idBloc=:idBloc and c.typeC=:tc")
    public List<Chambre> getChambreByBlocAndType(@Param("idBloc") Long idBloc,@Param("tc") TypeChambre tc);

}
