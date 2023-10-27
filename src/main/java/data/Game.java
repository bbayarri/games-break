package data;

import lombok.Data;

@Data
public class Game {
    private long id;
    private String name;
    private String releaseDate;
    private String genre;
    private double price;
    private String permalink;

    public Game(long id, String name, String releaseDate, String genre, double price, String permalink) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.price = price;
        this.permalink = permalink;
    }

}
