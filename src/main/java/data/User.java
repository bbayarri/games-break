package data;

import lombok.Data;

@Data
public class User {
    private long id;
    private String nickName;
    private String password;
    private String name;
    private String surname;
    private double money;
    private String createdDate;

    public User(long id, String nickName, String password, String name, String surname, double money, String createdDate) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.money = money;
        this.createdDate = createdDate;
    }

}
