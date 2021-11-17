package tn.esprit.spring.gestionmagasion.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionmagasion.Entities.DetailProduit;
import tn.esprit.spring.gestionmagasion.Service.DetailProduit.DetailProduitService;

import javax.validation.Valid;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/detailProduit/")
@Api(tags = "DetailProduit management")
public class DetailProduitController {
    @Autowired
    private DetailProduitService detailProduitService;

    @ApiOperation(value = "Ajouter un detailProduitService")
    @PostMapping("add")
    public DetailProduit add(@RequestBody DetailProduit detailProduit)
    {
        return detailProduitService.add(detailProduit);
    }

    @ApiOperation(value = "Mettre a jour un detailProduitService")
    @PutMapping("update/{id}")
    public DetailProduit update(@Valid @RequestBody DetailProduit detailProduit, @PathVariable("id") Long id) {
        return detailProduitService.update(detailProduit, id);
    }
}
