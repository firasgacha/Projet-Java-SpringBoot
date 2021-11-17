package tn.esprit.spring.gestionmagasion.Service.FactureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionmagasion.Entities.Facture;
import tn.esprit.spring.gestionmagasion.Repository.ClientRepository;
import tn.esprit.spring.gestionmagasion.Repository.FactureRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FactureServiceImpl implements FactureService{

    @Autowired
    private FactureRepository factureRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Facture add(Facture facture,Long idClient) {
        facture.setClient(clientRepository.getById(idClient));
        return factureRepository.save(facture);
    }

    @Override
    public Facture update(Facture facture, Long id) {
        if(factureRepository.findById(id).isPresent()){
           factureRepository.save(facture);
           return facture;
        }else return null;
    }

    @Override
    public void delete(long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public List<Facture> findAll() {
        return factureRepository.findAll();
    }


    @Override
    public Facture findById(Long id) {
        Optional<Facture> f = factureRepository.findById(id);
        return f.orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        return factureRepository.findFactureByClient(idClient);
    }
}
