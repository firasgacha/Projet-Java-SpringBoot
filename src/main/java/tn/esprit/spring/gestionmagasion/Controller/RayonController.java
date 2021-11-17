package tn.esprit.spring.gestionmagasion.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionmagasion.Entities.Rayon;
import tn.esprit.spring.gestionmagasion.Entities.Stock;
import tn.esprit.spring.gestionmagasion.Service.Rayon.RayonService;
import tn.esprit.spring.gestionmagasion.Service.Stock.StockService;

import javax.validation.Valid;
import java.util.List;


@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/rayon/")
@Api(tags = "Rayon management")
public class RayonController {
    @Autowired
    private RayonService rayonService;

    @ApiOperation(value = "Ajouter un rayon")
    @PostMapping("add")
    public Rayon add(@RequestBody Rayon rayon)
    {
        return rayonService.add(rayon);
    }

    @ApiOperation(value = "Mettre a jour un rayon")
    @PutMapping("update/{id}")
    public Rayon update(@Valid @RequestBody Rayon rayon, @PathVariable("id") Long id) {
        return rayonService.update(rayon, id);
    }

    @ApiOperation(value = "Supprimer un rayon")
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id) {
        rayonService.delete(id);
    }

    @ApiOperation(value = "Afficher la liste des rayons")
    @GetMapping("list")
    public List<Rayon> findAll() {
        return rayonService.findAll();
    }

    @ApiOperation(value = "Chercher un rayon par son ID")
    @GetMapping("findById/{id}")
    public Rayon findById(@PathVariable("id") Long id) {
        return rayonService.findById(id);
    }
}
