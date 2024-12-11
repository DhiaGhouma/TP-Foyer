package tn.esprit.springproject.restcontroller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.TypeChambre;
import tn.esprit.springproject.service.IchambreService;


import java.util.List;
@Tag(name = "Gestion Chambre")
@RestController
public class ChambreRestController {
    @Autowired
    private IchambreService ichambreService;

    @PostMapping("/addchambre")
    public Chambre addchambre(@RequestBody Chambre c) {

        return ichambreService.addchambre(c);
    }

    @PutMapping("/Updatechambre")
    @Operation(description = "Mise a jour d'une chambre de la base de données")
    public Chambre updatechambre (@RequestBody Chambre c){
        return ichambreService.addchambre(c);
    }

    @GetMapping("/readchambre")
    @Operation(description = "import des chambre de la base de données")
    public List<Chambre> retrieveAllchambre(){
        return ichambreService.retrieveAllchambre();
    }

    @GetMapping("/retrievechambreById/{idC}")
    @Operation(description = "afficher une chambre avec un id de la base de données")
    public Chambre retrievechambreById(@PathVariable long idC){
        return ichambreService.retrievechambreById(idC);

    }
    @DeleteMapping("/deletechambre/{idC}")
    public void Deletechambre(@PathVariable long idC){
        ichambreService.Deletechambre(idC);
    }

    @PostMapping ("/affecterChambresBloc/{idB}")
    public Bloc affecterChambresBloc(@RequestBody List<Long> idC, @PathVariable Long idB) {
        return ichambreService.affecterChambresBloc(idC,idB);

    }
    @GetMapping("/findByBloc_IdBlocAndTypeC/{idBloc}/{tc}")
    public List<Chambre> findByBloc_IdBlocAndTypeC(@PathVariable Long idBloc,@PathVariable TypeChambre tc)
    {
        return ichambreService.findByBloc_IdBlocAndTypeC(idBloc, tc);

    }
    }


