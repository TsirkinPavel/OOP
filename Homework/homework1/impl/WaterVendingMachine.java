package Homework.homework1.impl;

import java.util.List;

import Homework.homework1.Product;
import Homework.homework1.VendingMachine;


public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
