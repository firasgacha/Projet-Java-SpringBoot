package tn.esprit.spring.gestionmagasion.Service.Fournisseur;

import tn.esprit.spring.gestionmagasion.Entities.Fournisseur;

import java.util.List;

public interface FournisseurService {
    Fournisseur add(Fournisseur fournisseur);
    Fournisseur update(Fournisseur fournisseur, Long id);
    void delete(long id);
    List<Fournisseur> findAll();
    Fournisseur findById(Long id);

}
