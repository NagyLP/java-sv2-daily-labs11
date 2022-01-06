package day03;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private String name;
    private List<Product> products = new ArrayList<>();
    private int steksz;

    public User(String name, int steksz) {
        this.name = name;
        this.steksz = steksz;
    }

    public boolean addProduct(Product product) {
        if (steksz >= product.getPrice()) {
            return products.add(product);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getSteksz() {
        return steksz;
    }
}
