package tn.esprit.spring.gestionmagasion.Service.DetailFacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionmagasion.Entities.DetailFacture;
import tn.esprit.spring.gestionmagasion.Repository.DetailFactureRepository;

import java.util.List;

@Service
public class DetailFactureServiceImpl implements DetailFactureService{

    @Autowired
    private DetailFactureRepository detailFactureRepository;

    @Override
    public DetailFacture add(DetailFacture detailFacture)
    {
        return detailFactureRepository.save(detailFacture);
    }

    /*@Override
    public DetailFacture update(DetailFacture detailFacture, Long id) {
        if (detailFactureRepository.findById(id).isPresent())
        {
            detailFactureRepository.save(detailFacture);
            return detailFacture;
        }
        return null;
    }*/

    @Override
    public void delete(long id) {
        detailFactureRepository.deleteById(id);
    }

    /*@Override
    public List<DetailFacture> findAll() {
        return detailFactureRepository.findAll();
    }


    @Override
    public DetailFacture findById(Long id) {
        return detailFactureRepository.getById(id);
    }*/
}
