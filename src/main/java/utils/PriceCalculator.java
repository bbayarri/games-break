package utils;

import data.Intermediary;
import java.util.Date;

public class PriceCalculator {

    public double calculateTotalPrice(Intermediary intermediary, double price, Date date) {
        if(intermediary.equals(Intermediary.STEAM)) {
            return 0;
        } else if(intermediary.equals(Intermediary.EPIC_GAMES)) {
            return 1;
        } else {
            return 2;
        }

    }
}
