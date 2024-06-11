package Homework.homework2;

import java.time.LocalDate;
import java.util.List;

import Homework.homework2.impl.BottleOfBeer;
import Homework.homework2.impl.BottleOfWater;
import Homework.homework2.ProductRegister;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Иван");
        Human human2 = new Human("Владимир");
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1), false, 1);
        Product bottle2 = new BottleOfWater("Родники - газированная", 60, LocalDate.of(2024, 5, 1), true, 1);
        Product beer1 = new BottleOfBeer("Жигулевское", 80, LocalDate.of(2024, 5, 1), "Нефильтрованное", 0.5F);        
        Product beer2 = new BottleOfBeer("Балтика", 80, LocalDate.of(2024, 5, 1), "6", 0.5F);
        ProductRegister pr = new DrinkRegister();
        pr.addProducts(List.of(beer1, beer2, beer1, beer2, bottle1, bottle1, bottle2));
        System.out.println("Напитки в магазине: "+ pr.getProducts());
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        System.out.println("Заказ Владимира:");
        pr.getProduct("Жигулевское");
        pr.getProduct("Жигулевское", 0.5F, 80);
        System.out.println("Заказ Ивана:");
        pr.getProduct("Балтика");
        pr.getProduct("Балтика", 0.5F, 80);            
        market.releaseFromQueue();
        System.out.println("Напитки в магазине: "+ pr.getProducts());
    }
}
