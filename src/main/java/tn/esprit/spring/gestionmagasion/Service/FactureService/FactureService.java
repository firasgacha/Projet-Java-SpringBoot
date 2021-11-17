package tn.esprit.spring.gestionmagasion.Service.FactureService;

import tn.esprit.spring.gestionmagasion.Entities.Facture;

import java.util.List;

public interface FactureService {
    Facture add(Facture facture,Long idClient);
    Facture update(Facture facture, Long id);
    void delete(long id);
    List<Facture> findAll();
    Facture findById(Long id);
    List<Facture> getFacturesByClient(Long idClient);
}
