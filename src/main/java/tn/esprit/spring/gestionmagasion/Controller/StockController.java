package tn.esprit.spring.gestionmagasion.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionmagasion.Entities.Stock;
import tn.esprit.spring.gestionmagasion.Service.Stock.StockService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/stock/")
@Api(tags = "Stock management")
public class StockController {
    @Autowired
    private StockService stockService;

    @ApiOperation(value = "Ajouter un stock")
    @PostMapping("add")
    public Stock add(@RequestBody Stock stock)
    {
        return stockService.add(stock);
    }

    @ApiOperation(value = "Mettre a jour un Stock")
    @PutMapping("update/{id}")
    public Stock update(@Valid @RequestBody Stock stock, @PathVariable("id") Long id) {
        return stockService.update(stock, id);
    }

    @ApiOperation(value = "Supprimer un Stock")
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id) {
        stockService.delete(id);
    }

    @ApiOperation(value = "Afficher la liste des Stock")
    @GetMapping("list")
    public List<Stock> findAll() {
        return stockService.findAll();
    }

    @ApiOperation(value = "Chercher un Stock par son ID")
    @GetMapping("findById/{id}")
    public Stock findById(@PathVariable("id") Long id) {
        return stockService.findById(id);
    }
}
