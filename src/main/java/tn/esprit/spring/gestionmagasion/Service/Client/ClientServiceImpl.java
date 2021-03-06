package tn.esprit.spring.gestionmagasion.Service.Client;


import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionmagasion.Entities.CategorieClient;
import tn.esprit.spring.gestionmagasion.Entities.Client;
import tn.esprit.spring.gestionmagasion.Repository.ClientRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    float sum;
    @Override
    public Client add(Client client) {

        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client, Long id) {
        Optional<Client> c = clientRepository.findById(id);
        if (c.isPresent()) {
            clientRepository.save(client);
            return client;
        } else return null;
    }

    @Override
    public void delete(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }


    @Override
    public Client findById(Long id) {
        Optional<Client> c = clientRepository.findById(id);
        if(c.isPresent())  return c.get();
        return  null;
    }

    @Override
    public float getChiffreAffiareParCategorie(CategorieClient categorieClient, Date startDate, Date EndDate) {
        List<Client> c = clientRepository.findAll();

        c.forEach(e->{
            if (e.getCategorieClient() == categorieClient){
                e.getFactures().forEach(facture -> {
                    if(facture.getDateFacture().after(startDate) && facture.getDateFacture().before(EndDate)){
                        sum = sum + facture.getMontantFacture();
                    }
                });
            }

        });
        return sum;
    }
}
