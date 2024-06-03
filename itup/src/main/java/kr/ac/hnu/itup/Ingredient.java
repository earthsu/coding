package kr.ac.hnu.itup;

import lombok.Data;
import lombok.Setter;
@Setter
public class Ingredient {

    private String name;
    private double price;

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getName() {
        return false;
    }
}

