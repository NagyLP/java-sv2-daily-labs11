package day03;

import java.time.LocalDate;

public class Item extends Product {

    private boolean extendedExpiratonDate;

    public Item(String name, int price, LocalDate dateOfBuy, boolean extendedExpiratonDate) {
        super(name, extendedExpiratonDate? ((int) (price*1.1)) : price, dateOfBuy.plusYears(1));
        this.extendedExpiratonDate = extendedExpiratonDate;
    }

    private LocalDate calculateExperationDate(boolean isExtended, LocalDate dateOfBuy) {
        if (isExtended) {
            return dateOfBuy.plusYears(3);
        } else {
            return dateOfBuy.plusMonths(3);
        }
    }
}
