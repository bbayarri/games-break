package utils;

import data.Intermediary;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    @Test
    public void calculate_total_price_steam_should_return_total_price() {
        //Arrange
        PriceCalculator priceCalculator = new PriceCalculator();

        //Act
        double totalPrice = priceCalculator.calculateTotalPrice(Intermediary.STEAM, 100, new Date());

        //Assert
        assertEquals(102, totalPrice);
    }

    @Test
    public void calculate_total_price_epic_games_hour_between_range_should_return_total_price() throws ParseException {
        //Arrange
        PriceCalculator priceCalculator = new PriceCalculator();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2023-10-26 21:30:00");


        //Act
        double totalPrice = priceCalculator.calculateTotalPrice(Intermediary.EPIC_GAMES, 100, date);

        //Assert
        assertEquals(101, totalPrice);
    }

    @Test
    public void calculate_total_price_epic_games_hour_out_of_range_should_return_total_price() throws ParseException {
        //Arrange
        PriceCalculator priceCalculator = new PriceCalculator();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2023-10-26 15:30:00");

        //Act
        double totalPrice = priceCalculator.calculateTotalPrice(Intermediary.EPIC_GAMES, 100, date);

        //Assert
        assertEquals(103, totalPrice);
    }

    @Test
    public void calculate_total_price_nakama_weekend_should_return_total_price() throws ParseException {
        //Arrange
        PriceCalculator priceCalculator = new PriceCalculator();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2023-10-21 15:30:00");

        //Act
        double totalPrice = priceCalculator.calculateTotalPrice(Intermediary.NAKAMA, 100, date);

        //Assert
        assertEquals(103, totalPrice);
    }

    @Test
    public void calculate_total_price_nakama_not_weekend_should_return_total_price() throws ParseException {
        //Arrange
        PriceCalculator priceCalculator = new PriceCalculator();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2023-10-25 15:30:00");

        //Act
        double totalPrice = priceCalculator.calculateTotalPrice(Intermediary.NAKAMA, 100, date);

        //Assert
        assertEquals(100.75, totalPrice);
    }

}