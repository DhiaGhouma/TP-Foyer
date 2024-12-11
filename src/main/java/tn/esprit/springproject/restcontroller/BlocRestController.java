package tn.esprit.springproject.restcontroller;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.service.IblocService;


import java.util.List;

@RestController
public class BlocRestController {
    @Autowired
    private IblocService iblocService;

    @PostMapping("/addbloc")
    public Bloc addbloc(@RequestBody Bloc b) {

        return iblocService.addbloc(b);
    }
    @PutMapping("/Updatebloc")
    public Bloc updatebloc (@RequestBody Bloc b){
        return iblocService.addbloc(b);
    }

    @GetMapping("/readbloc")
    public List<Bloc> retrieveAllbloc(){
        return iblocService.retrieveAllbloc();
    }

    @GetMapping("/retrieveblocById/{idBloc}")
    public Bloc retrieveblocById(@PathVariable long idBloc){
        return iblocService.retrieveblocById(idBloc);

    }
    @DeleteMapping("/deletebloc/{idBloc}")
    public void Deletebloc(@PathVariable long idBloc){
        iblocService.Deletebloc(idBloc);
    }

    @PostMapping   ("/affecterBlocAfoyer/{idB}/{idF}")
    public Bloc affecterBlocAfoyer(@PathVariable Long idB,@PathVariable Long idF) {
        return iblocService.affecterBlocAfoyer(idB, idF);
    }

    @GetMapping("getBlocByCapacite/{capaciteB}")
    public Bloc getBlocByCapacite (@PathVariable Long capaciteB)
    {
        return  iblocService.getBlocByCapacite(capaciteB);
    }
    }
