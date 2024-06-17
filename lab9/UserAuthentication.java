package lab9;

import java.util.HashMap;
import java.util.Map;
class UserManager {
    private Map<String, String> users = new HashMap<>(); 

    public UserManager() {
        // Add some users (for demonstration)
        users.put("user1", "password1");
        users.put("user2@example.com", "password2");
        users.put("+1234567890", "pin1234");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public boolean authenticate(String email, String password, boolean isEmail) {
        return users.containsKey(email) && users.get(email).equals(password);
    }

    public boolean authenticate(String phoneNumber, int pin) {
        String pinString = String.valueOf(pin);
        return users.containsKey(phoneNumber) && users.get(phoneNumber).equals(pinString);
    }
}

public class UserAuthentication {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println("Authenticate user1 with password1: " + userManager.authenticate("user1", "password1"));
        System.out.println("Authenticate user2@example.com with password2: " + userManager.authenticate("user2@example.com", "password2", true));
        System.out.println("Authenticate +1234567890 with pin1234: " + userManager.authenticate("+1234567890", 1234));
    }
}