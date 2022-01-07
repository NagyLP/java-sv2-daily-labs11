package day04;

import java.time.LocalDate;

public abstract class Product {

    private String name;
    private int price;
    private LocalDate experationDate;

    public Product(String name, int price, LocalDate experationDate) {
        this.name = name;
        this.price = price;
        this.experationDate = experationDate;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getExperationDate() {
        return experationDate;
    }
}
