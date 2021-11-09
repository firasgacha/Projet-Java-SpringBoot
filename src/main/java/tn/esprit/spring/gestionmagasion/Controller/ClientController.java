package tn.esprit.spring.gestionmagasion.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionmagasion.Entities.Client;
import tn.esprit.spring.gestionmagasion.Service.Client.ClientService;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/client/")
@Api(tags = "Client management")
public class ClientController  {

    @Autowired
    private ClientService clientService;

    @ApiOperation(value = "Ajouter un Client")
    @PostMapping("add")
    public Client add(@RequestBody Client client) {
        return clientService.add(client);
    }

    @ApiOperation(value = "Mettre a jour un Client")
    @PutMapping("update/{id}")
    public Client update(@Valid @RequestBody Client client,@PathVariable("id") Long id) {
        return clientService.update(client, id);
    }

    @ApiOperation(value = "Supprimer un Client")
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id) {
        clientService.delete(id);
    }

    @ApiOperation(value = "Afficher la liste des Client")
    @GetMapping("list")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @ApiOperation(value = "Chercher un Client par son ID")
    @GetMapping("findById/{id}")
    public Client findById(@PathVariable("id") Long id) {
        return clientService.findById(id);
    }
}
