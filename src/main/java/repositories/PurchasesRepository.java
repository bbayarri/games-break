package repositories;

import data.Purchase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PurchasesRepository {
    private final List<Purchase> purchases = new ArrayList<>();

    public PurchasesRepository() {
        purchases.add(new Purchase(1L, 1504L, 1L, 350.50, "2023/01/01"));
        purchases.add(new Purchase(2L, 1504L, 4L, 100.75, "2023/02/15"));
        purchases.add(new Purchase(3L, 1504L, 7L, 250.50, "2023/03/20"));
        purchases.add(new Purchase(4L, 1504L, 10L, 50.00, "2023/04/05"));
        purchases.add(new Purchase(5L, 1504L, 13L, 1350.15, "2023/05/10"));
        purchases.add(new Purchase(6L, 2802L, 2L, 20.30, "2023/06/15"));
        purchases.add(new Purchase(7L, 2802L, 9L, 450.75, "2023/07/20"));
        purchases.add(new Purchase(8L, 2802L, 11L, 500.00, "2023/08/25"));
        purchases.add(new Purchase(9L, 1510L, 3L, 350.50, "2023/09/30"));
        purchases.add(new Purchase(10L, 1510L, 5L, 150.00, "2023/10/05"));
    }

    public void add(Purchase purchase) {

    }

    public List<Purchase> get() {
        return Collections.emptyList();
    }
}

