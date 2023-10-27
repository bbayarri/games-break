package repositories;

import data.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    private List<User> users = new ArrayList<>();

    public UsersRepository() {
        users.add(new User(1504L, "BRIAN_BAYARRI", "abc123", "Brian", "Bayarri", 350.50, "2022/12/10"));
        users.add(new User(2802L, "ALAN_MERLO", "lock_password", "Alan", "Merlo", 200.50, "2021/01/11"));
        users.add(new User(1510L, "JOSEMA", "@12345", "Jose", "Ma", 12.0, "2018/04/15"));
    }

    public User login(String username, String password) {
        return null;
    }
}

