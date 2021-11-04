package tn.esprit.spring.gestionmagasion.Service.Produit;

import tn.esprit.spring.gestionmagasion.Entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit add(Produit produit);
    Produit update(Produit produit, Long id);
    void delete(long id);
    List<Produit> findAll();
    Produit findById(Long id);
}
