package data;

public class Purchase {
    private long id;
    private long userId;
    private long gameId;
    private double amount;
    private String createdDate;

    public Purchase(long id, long userId, long gameId, double amount, String createdDate) {
        this.id = id;
        this.userId = userId;
        this.gameId = gameId;
        this.amount = amount;
        this.createdDate = createdDate;
    }
}
