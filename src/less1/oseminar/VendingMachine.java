package less1.oseminar;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;    
}
