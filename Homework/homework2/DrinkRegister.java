package Homework.homework2;

import java.util.List;

public class DrinkRegister extends ProductRegister{
    public DrinkRegister(){
        super();
    }

    public DrinkRegister(List<Product> products){
        super(products);
        
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

}
