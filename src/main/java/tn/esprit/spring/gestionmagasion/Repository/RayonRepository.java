package tn.esprit.spring.gestionmagasion.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionmagasion.Entities.Rayon;

@Repository
public interface RayonRepository extends JpaRepository<Rayon,Long> {
}
