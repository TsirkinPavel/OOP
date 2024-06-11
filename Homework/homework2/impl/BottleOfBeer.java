package Homework.homework2.impl;

import java.time.LocalDate;

import Homework.homework2.Product;

public class BottleOfBeer extends Product{
    private float volume;
    private String typeOfDrink;
    

public BottleOfBeer(String name, double price, LocalDate releaseDate, String typeOfDrink, float volume) {
    super(name, price, releaseDate);   
    this.typeOfDrink = typeOfDrink; 
    this.volume = volume;
    
}
//BottleOfBeer
public float getVolume() {
    return volume;
}
public String getTypeOfDrink() {
    return typeOfDrink;
}
@Override
    public String toString() {
        return "BottleOfBeer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", typeOfDrink='" + typeOfDrink + 
                '}';
    }

}
