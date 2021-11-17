package tn.esprit.spring.gestionmagasion;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.gestionmagasion.Entities.Facture;
import tn.esprit.spring.gestionmagasion.Service.FactureService.FactureService;

import java.util.Date;

@Slf4j
@SpringBootTest
public class FactureTests {
    @Autowired
    private FactureService factureservice;

    /*@Test
    void AddFacture(){
        Date date = new Date("13/02/1998");
        Facture facture = new Facture(5L,600,800,date,true);
        factureservice.add(facture);
    }*/
    @Test
    void DeleteFacture(){
        factureservice.delete(1L);
    }
    @Test
    void GetFacture(){
        for (Facture e : factureservice.findAll()) {
            log.info(e.toString());
        }
    }
    @Test
    void UpdateFacture(){
        Facture facture = factureservice.findById(1L);
        facture.setMontantFacture(500);
        facture.setMontantRemise(999);
        facture.setActive(false);
        factureservice.update(facture,1L);
    }
}
