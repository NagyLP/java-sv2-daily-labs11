package day04;

import java.time.LocalDate;

public class Service extends Product{

    public Service(String name, int price, LocalDate dateOfBuy) {
        super(name, price, dateOfBuy.plusYears(1));
    }
}
