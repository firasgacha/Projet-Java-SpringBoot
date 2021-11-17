package tn.esprit.spring.gestionmagasion.Controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionmagasion.Entities.Fournisseur;
import tn.esprit.spring.gestionmagasion.Service.Fournisseur.FournisseurService;

import java.util.List;

@Controller
public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;

    @ApiOperation(value = "Ajouter Un Fournisseur")
    @PostMapping("add")
    public Fournisseur add(@RequestBody Fournisseur fournisseur){
        return fournisseurService.add(fournisseur);
    }

    @ApiOperation(value = "Mettre a jour un Fournisseur")
    @PutMapping("update/{id}")
    public Fournisseur update(@RequestBody Fournisseur fournisseur, @PathVariable("id") Long id)
    {
        return fournisseurService.update(fournisseur, id);
    }

    @ApiOperation(value = "Supprimer Un Fournisseur")
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id)
    {
        fournisseurService.delete(id);
    }

    @ApiOperation(value = "Afficher la liste des Fournisseurs")
    @GetMapping("list")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }

    @ApiOperation(value = "Chercher un Fournisseur par son ID")
    @GetMapping("findById/{id}")
    public Fournisseur findById(@PathVariable("id") Long id)
    {
        return fournisseurService.findById(id);
    }
}
