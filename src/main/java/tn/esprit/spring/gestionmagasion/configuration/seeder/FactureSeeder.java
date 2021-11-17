package tn.esprit.spring.gestionmagasion.configuration.seeder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.esprit.spring.gestionmagasion.Entities.Facture;
import tn.esprit.spring.gestionmagasion.Service.FactureService.FactureService;

@Component
public class FactureSeeder {

    @Autowired
    FactureService factureService;

    @Autowired
    private ClientSeeder clientSeeder;

    public Facture  facture1;
    public Facture facture2;
    public Facture  facture3;



    public  void seed(){
        facture1 = new Facture(15F,50F, clientSeeder.client1);
        facture2 = new Facture(3F,30F,clientSeeder.client2);
        facture3 = new Facture(10F,50F,clientSeeder.client3);
        //factureService.add(facture1);
        //factureService.add(facture2);
        //factureService.add(facture3);

    }
}
