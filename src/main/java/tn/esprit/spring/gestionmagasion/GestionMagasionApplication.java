package tn.esprit.spring.gestionmagasion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@EnableSwagger2
@SpringBootApplication
@Slf4j
public class GestionMagasionApplication {
    public static void main(String[] args) {

        SpringApplication.run(GestionMagasionApplication.class, args);

    }

}
