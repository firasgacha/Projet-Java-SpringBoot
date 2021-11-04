package tn.esprit.spring.gestionmagasion.Service.DetailProduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionmagasion.Entities.DetailProduit;
import tn.esprit.spring.gestionmagasion.Repository.DetailProduitRepository;

import java.util.List;

@Service
public class DetailProduitServiceImpl implements DetailProduitService{

    @Autowired
    private DetailProduitRepository detailProduitRepository;

    @Override
    public DetailProduit add(DetailProduit detailProduit) {
        return detailProduitRepository.save(detailProduit);
    }

    @Override
    public DetailProduit update(DetailProduit detailProduit, Long id) {
        return null;
    }

    @Override
    public void delete(long id) {
        detailProduitRepository.deleteById(id);
    }

    @Override
    public List<DetailProduit> findAll() {
        return detailProduitRepository.findAll();
    }


    @Override
    public DetailProduit findById(Long id) {
        return detailProduitRepository.getById(id);
    }
}
