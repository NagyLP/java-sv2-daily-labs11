package day01;

public class NormalUser implements User {

    private String userEmail;
    public String password;

    public NormalUser(String email, String password) {
        this.userEmail = email;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
