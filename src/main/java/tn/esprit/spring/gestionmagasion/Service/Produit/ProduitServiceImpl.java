package tn.esprit.spring.gestionmagasion.Service.Produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionmagasion.Entities.DetailFacture;
import tn.esprit.spring.gestionmagasion.Entities.Produit;
import tn.esprit.spring.gestionmagasion.Repository.ProduitRepository;
import tn.esprit.spring.gestionmagasion.Repository.StockRepository;
import tn.esprit.spring.gestionmagasion.Service.DetailFacture.DetailFactureService;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class ProduitServiceImpl implements ProduitService{
    
    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private StockRepository stockRepository;
    @Override
    public Produit add(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit update(Produit produit, Long id) {
        if(produitRepository.findById(id).isPresent()){
            produitRepository.save(produit);
            return produit;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }


    @Override
    public Produit findById(Long id) {
        return produitRepository.getById(id);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p = produitRepository.getById(idProduit);
        p.setStock(stockRepository.getById(idStock));
        produitRepository.save(p);
    }

    @Override
    public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
        Produit p = produitRepository.getById(idProduit);
        return p.getDetailFacture().getQte()*p.getPrixUnitaire();
    }
}
