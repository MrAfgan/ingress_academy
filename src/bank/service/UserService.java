package bank.service;

public class UserService {
    public boolean login(String username, String password) {
        return username.equals("user") && password.equals("1234");
    }
}
