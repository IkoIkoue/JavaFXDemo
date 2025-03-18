package project.rpcs.javafxdemo;

import java.util.ArrayList;

public class LoginModel {

    private ArrayList<StoredUser> storedUsers;

    public LoginModel() {
        this.storedUsers = new ArrayList<>();
    }

    private void printStoredUsers() {
        for (StoredUser storedUser : storedUsers) {
            System.out.println("============================================");
            System.out.println("Username: " + storedUser.username());
            System.out.println("Password: " + storedUser.password());
            System.out.println("Has Been Used: " + storedUser.hasBeenUsed());
            System.out.println("============================================");
        }
        System.out.println("New Users: " + storedUsers.size());
        System.out.println();
    }

    public void addUser(String username, String password, boolean hasBeenUsed) {
        StoredUser user = new StoredUser(username, password, hasBeenUsed);
        storedUsers.add(user);
        printStoredUsers();
    }


}
