package tn.esprit.spring.gestionmagasion.Service.DetailProduit;

import tn.esprit.spring.gestionmagasion.Entities.DetailProduit;

import java.util.List;

public interface DetailProduitService {
    DetailProduit add(DetailProduit detailProduit);
    DetailProduit update(DetailProduit detailProduit, Long id);
    /*void delete(long id);
    List<DetailProduit> findAll();
    DetailProduit findById(Long id);*/
}
