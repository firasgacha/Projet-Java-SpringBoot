package tn.esprit.spring.gestionmagasion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.gestionmagasion.Repository.ClientRepository;
import tn.esprit.spring.gestionmagasion.configuration.seeder.SeedByOrder;
import javax.annotation.PostConstruct;


@EnableSwagger2
@SpringBootApplication
@Slf4j
public class GestionMagasionApplication {
    @Autowired
    SeedByOrder seedByOrder;

    @Autowired
    ClientRepository clientRepository;
    public static void main(String[] args) {

        SpringApplication.run(GestionMagasionApplication.class, args);
    }
        @PostConstruct
        public void init() throws Exception {

                seedByOrder.init();
        }
}
