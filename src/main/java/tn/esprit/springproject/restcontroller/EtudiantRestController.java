package tn.esprit.springproject.restcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.service.IetudiantService;


import java.util.List;

@RestController
public class EtudiantRestController {
    @Autowired
    private IetudiantService ietudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {

        return ietudiantService.addEtudiant(e);
    }
    @PutMapping("/UpdateEtudiant")
    public Etudiant updateEtudiant (@RequestBody Etudiant e){
        return ietudiantService.addEtudiant(e);
    }

    @GetMapping("/readEtudiant")
    public List<Etudiant> retrieveAllEtudiant(){
        return ietudiantService.retrieveAllEtudiant();
    }

    @GetMapping("/retrieveEtudiantById/{idE}")
    public Etudiant retrieveEtudiantById(@PathVariable long idE){
        return ietudiantService.retrieveEtudiantById(idE);

    }
    @DeleteMapping("/deleteEtudiant/{idE}")
    public void DeleteEtudiant(@PathVariable long idE){
        ietudiantService.DeleteEtudiant(idE);
    }

}
