package simplews;

public class LoginService {

    public static String login(String username, String password) {

        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return "Login Failed";
        }

        if (!username.equals("student")) {
            return "Invalid Username";
        }

        if (!password.equals("pass123")) {
            return "Invalid Password";
        }

        return "Login Successful";
    }
}