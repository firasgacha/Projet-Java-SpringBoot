package tn.esprit.spring.gestionmagasion.configuration.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.esprit.spring.gestionmagasion.Entities.CategorieProduit;
import tn.esprit.spring.gestionmagasion.Entities.DetailProduit;
import tn.esprit.spring.gestionmagasion.Entities.Produit;
import tn.esprit.spring.gestionmagasion.Service.Produit.ProduitService;

import java.util.Date;

@Component
public class ProduitSeeder {

    @Autowired
    ProduitService produitService;

    @Autowired
    RayonSeeder rayonSeeder;

    @Autowired
    StockSeeder stockSeeder;

    public Produit produit1;
    public Produit produit2;
    public Produit produit3;

    public void seed(){

        produit1 = new Produit("P123","Produit 1",2.5F, new DetailProduit(new Date(),null, CategorieProduit.ALIMENTAIRE), rayonSeeder.rayon1, stockSeeder.stock1);
        produit2 = new Produit("P456","Produit 2",5F, new DetailProduit(new Date(),null, CategorieProduit.QUINCAILLERIE), rayonSeeder.rayon2,stockSeeder.stock2);
        produit3 = new Produit("P789","Produit 3",3F, new DetailProduit(new Date(),null, CategorieProduit.ELECTROMENAGER), rayonSeeder.rayon3, stockSeeder.stock3);

        produitService.add(produit1);
        produitService.add(produit2);
        produitService.add(produit3);

    }
}
