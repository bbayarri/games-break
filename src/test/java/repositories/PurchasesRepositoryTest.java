package repositories;

import data.Game;
import data.Purchase;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PurchasesRepositoryTest {

    @Test
    public void get_should_return_purchases_list() {
        //Arrange
        PurchasesRepository purchasesRepository = new PurchasesRepository();

        //Act
        List<Purchase> purchases = purchasesRepository.get();

        //Assert
        assertEquals(10, purchases.size());
    }

    @Test
    public void add_should_return_purchases_list_with_new_element() {
        //Arrange
        PurchasesRepository purchasesRepository = new PurchasesRepository();
        Purchase purchaseMock = new Purchase(11L, 1510L, 5L, 150.00, "2023/10/05");

        //Act
        purchasesRepository.add(purchaseMock);
        List<Purchase> purchases = purchasesRepository.get();

        //Assert
        assertEquals(11, purchases.size());
    }

}