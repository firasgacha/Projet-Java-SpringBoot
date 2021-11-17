package tn.esprit.spring.gestionmagasion.Service.Fournisseur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionmagasion.Entities.Fournisseur;
import tn.esprit.spring.gestionmagasion.Entities.Produit;
import tn.esprit.spring.gestionmagasion.Repository.FournisseurRepository;
import tn.esprit.spring.gestionmagasion.Repository.ProduitRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FournisseurServiceImpl implements FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;
    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public Fournisseur add(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur update(Fournisseur f, Long id) {
        if (fournisseurRepository.findById(id).isPresent())
        {
            fournisseurRepository.save(f);
            return f;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public List<Fournisseur> findAll() {
        return fournisseurRepository.findAll();
    }


    @Override
    public Fournisseur findById(Long id) {
        return fournisseurRepository.getById(id);
    }

    @Transactional
    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId)
    {
        Fournisseur f = fournisseurRepository.getById(fournisseurId);
        List <Produit> p = null;
        assert false;
        p.add(produitRepository.getById(produitId));
        f.setProduits(p);
        fournisseurRepository.save(f);
    }
}
