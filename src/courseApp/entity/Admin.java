package courseApp.entity;

public class Admin {
    private String userName;
    private String password;

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean login(String userName, String password){
        if ((userName.equals("Admin")&& password.equals("1234"))){
            System.out.println("Daxil oldunuz!");
            return true;
        }else System.out.println("Yalnis loqin yaxud parol");
        return false;
    }
}
