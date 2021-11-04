package tn.esprit.spring.gestionmagasion;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.gestionmagasion.Entities.CategorieClient;
import tn.esprit.spring.gestionmagasion.Entities.Client;
import tn.esprit.spring.gestionmagasion.Entities.Profession;
import tn.esprit.spring.gestionmagasion.Service.Client.ClientService;

import java.util.Date;

@Slf4j
@SpringBootTest
public class ClientTests {
    @Autowired
    private ClientService clientService;
    @Test
    void AddClient(){
        Date date = new Date("13/02/1998");
        Client client = new Client("Alex","TS",date,"firas.gacha@esprit.tn","esprit2021",
                CategorieClient.Fidele, Profession.Inghenieur);
        clientService.add(client);
    }
    @Test
    void GetClient(){
        for (Client c : clientService.findAll()) {
            log.info(c.toString());
        }
    }
    @Test
    void UpadteClient(){
        Client client = clientService.findById(2L);
        client.setNom("Ahmed");
        client.setPrenom("Ahmed");
        client.setEmail("ahmed@esprit.tn");
        client.setCategorieClient(CategorieClient.Premium);
        client.setProffesion(Profession.Etudiant);
        clientService.update(client,(long)2);
    }
    @Test
    void DeleteClient(){
        clientService.delete(1L);
    }
}
