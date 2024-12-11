package tn.esprit.springproject.restcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.service.IuniversiteService;


import java.util.List;

@RestController
public class UniversitetRestController {
    @Autowired
    private IuniversiteService iUniversiteService;


    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {

        return iUniversiteService.addUniversite(universite);
    }
    @PutMapping("/UpdateUniversite")
    public Universite updateUniversite (@RequestBody Universite universite){
        return iUniversiteService.addUniversite(universite);
    }

    @GetMapping("/readUniversite")
    public List<Universite> retrieveAllUniversite(){
        return iUniversiteService.retrieveAllUniversite();
    }

    @GetMapping("/retrieveUniversiteById/{idUniversite}")
    public Universite retrieveUniversiteById(@PathVariable long idUniversite){
        return iUniversiteService.retrieveUniversiteById(idUniversite);

    }
    @DeleteMapping("/deleteUniversite/{idUniversite}")
    public void DeleteUniversite(@PathVariable long idUniversite){
        iUniversiteService.DeleteUniversite(idUniversite);
    }

    @PostMapping("/affecterFoyerUniversite/{idF}/{idUniversite}")
    public Universite affecterFoyerUniversite (@PathVariable long idF, @PathVariable long idUniversite)
    {
        return iUniversiteService.affecterFoyerUniversite(idF, idUniversite);
    }
    @PostMapping("/desafecterFoyerUniversite/{idUniversite}")
    public Universite desafecterFoyerUniversite(@PathVariable long idUniversite) {
        return iUniversiteService.desafecterFoyerUniversite(idUniversite);

    }
}
