package model;

public class UserAccount {
    private String userId;
    private String username;
    private String password;
    private String role;

    public UserAccount(String userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    public void logout() {
        System.out.println(username + " logged out");
    }

    // Getters
    public String getUserId() { return userId; }
    public String getRole() { return role; }
}
