package tn.esprit.spring.gestionmagasion.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionmagasion.Entities.Facture;
import tn.esprit.spring.gestionmagasion.Service.FactureService.FactureService;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/facture/")
@Api(tags = "Facture management")
public class FactureController {
    @Autowired
    private FactureService factureService;

    @ApiOperation(value = "Ajouter Facture")
    @PostMapping("add")
    public Facture add(@RequestBody Facture facture, Long idClient){
        return factureService.add(facture,idClient);
    }
    @ApiOperation(value = "Mettre a jour un Facture")
    @PutMapping("update/{id}")
    public Facture update(@RequestBody Facture facture, @PathVariable("id") Long id)
    {
        return factureService.update(facture, id);
    }
    @ApiOperation(value = "Supprimer un Facture")
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id)
    {
        factureService.delete(id);
    }

    @ApiOperation(value = "Afficher la liste des Facture")
    @GetMapping("list")
    public List<Facture> findAll() {
        return factureService.findAll();
    }

    @ApiOperation(value = "Chercher une Facture par son ID")
    @GetMapping("findById/{id}")
    public Facture findById(@PathVariable("id") Long id)
    {
        return factureService.findById(id);
    }
}
