package tn.esprit.springproject.restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.service.IfoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    private IfoyerService ifoyerService;

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {

        return ifoyerService.addFoyer(f);
    }
    @PutMapping("/UpdateFoyer")
    public Foyer updateFoyer (@RequestBody Foyer f){
        return ifoyerService.addFoyer(f);
    }
    @GetMapping("/readFoyer")
    public List<Foyer> retrieveAllFoyer(){
        return ifoyerService.retrieveAllFoyer();
    }
    @GetMapping("/retrieveFoyerById/{idF}")
    public Foyer retrieveFoyerById(@PathVariable long idF){
        return ifoyerService.retrieveFoyerById(idF);

    }
    @DeleteMapping("/deleteFoyer/{idF}")
    public void DeleteFoyer(@PathVariable long idF){
        ifoyerService.DeleteFoyer(idF);
    }

    @PostMapping("addFoyerandAffectTouniversite/{idU}")
    public Foyer addFoyerandAffectTouniversite(@RequestBody Foyer foyer, @PathVariable Long idU)
    {
        return ifoyerService.addFoyerandAffectTouniversite(foyer, idU);
    }

    @GetMapping("/getFoyerByNom/{NomF}")
    public Foyer getFoyerByNom(@PathVariable String NomF){
        return ifoyerService.getFoyerByNom(NomF);
    }
    }




