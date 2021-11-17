package tn.esprit.spring.gestionmagasion.Service.DetailFacture;

import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionmagasion.Entities.DetailFacture;

import java.util.List;

@Service
public interface DetailFactureService {
    DetailFacture add(DetailFacture detailFacture);
    //DetailFacture update(DetailFacture detailFacture, Long id);
    void delete(long id);
    /*List<DetailFacture> findAll();
    DetailFacture findById(Long id);*/
}
