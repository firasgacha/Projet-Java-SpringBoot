package tn.esprit.spring.gestionmagasion.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionmagasion.Entities.DetailFacture;
import tn.esprit.spring.gestionmagasion.Service.DetailFacture.DetailFactureService;

@RestController
@CrossOrigin("*")
@RequestMapping("/detailFacture/")
@Api(tags = "DetailFacture management")
public class DetailFactureController {
    @Autowired
    private DetailFactureService detailFactureService;

    @ApiOperation(value = "Ajouter un DetailFacture")
    @PostMapping("add")
    public DetailFacture add(@RequestBody DetailFacture detailFacture)
    {
        return detailFactureService.add(detailFacture);
    }

    @ApiOperation(value = "Supprimer un DetailFacture")
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id) {
        detailFactureService.delete(id);
    }
}
