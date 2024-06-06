package Homework.homework1.impl;

import java.util.List;

import Homework.homework1.Product;
import Homework.homework1.VendingMachine;

public class HotDrinkVM extends VendingMachine {
    private int temperature;

    public HotDrinkVM(List<Product> products, int temperature) {
        super(products);
        this.temperature = temperature;
    }


    public HotDrinkVM(int temperature) {
        super();
        this.temperature = temperature;
    }


    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public int getTemperature() {
        return temperature;
    }   

    public List<Product> getProducts() {
        return products;
    }

    
}
