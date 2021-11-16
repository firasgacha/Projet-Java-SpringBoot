package tn.esprit.spring.gestionmagasion.configuration.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.esprit.spring.gestionmagasion.Entities.Stock;
import tn.esprit.spring.gestionmagasion.Service.Stock.StockService;

@Component
public class StockSeeder {

    @Autowired
    StockService stockService;

    public Stock stock1;
    public Stock stock2;
    public Stock stock3;

    public void seed(){
        stock1 = new Stock(10,5,"stock 1");
        stock2 = new Stock(15,2,"stock 2");
        stock3 = new Stock(25,10,"stock 3");

        stockService.add(stock1);
        stockService.add(stock2);
        stockService.add(stock3);

    }
}
