package day01;

public class NormalUser implements User {

    private String userEmail;
    public String userPassword;

    public NormalUser(String email, String password) {
        this.userEmail = email;
        this.userPassword = password;
    }

    @Override
    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String getUserPassword() {
        return userPassword;
    }


}
