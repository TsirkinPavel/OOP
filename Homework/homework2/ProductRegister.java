package Homework.homework2;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductRegister {

    protected List<Product> products;    

    public ProductRegister() {
        this.products = new ArrayList<>();        
    }

    public ProductRegister(List<Product> products) {
        this.products = products;        
    }

    public abstract void addProducts (List<Product> products);

    public Product getProduct(String name) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);                
                return product;
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public void getProduct(String name, float volume, double price) {
       
                System.out.println("Product: " + name  + ", Volume: " + volume + ", Price: " + price + " rub., ");
                
            }

    public List<Product> getProducts() {
        return products;
    }
}

