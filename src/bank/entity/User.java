package bank.entity;

public class User {
    private String UserName;
    private String password;

    public User(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return password;
    }
}
