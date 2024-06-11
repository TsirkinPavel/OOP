package Homework.homework2.impl;

import java.time.LocalDate;

import Homework.homework2.Product;

public class BottleOfWater extends Product {

    private float volume;   
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean spark, float volume) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = volume;
        
    }

    public float getVolume() {
        return volume;
    }

    

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", isSpark=" + isSpark +
                '}';
    }
}
