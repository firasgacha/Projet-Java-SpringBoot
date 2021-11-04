package tn.esprit.spring.gestionmagasion.Service.Rayon;

import tn.esprit.spring.gestionmagasion.Entities.Rayon;

import java.util.List;

public interface RayonService {
    Rayon add(Rayon rayon);
    Rayon update(Rayon rayon, Long id);
    void delete(long id);
    List<Rayon> findAll();
    Rayon findById(Long id);
}
