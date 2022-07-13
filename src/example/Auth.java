package example;

import java.util.Scanner;

public class Auth {

    private static final String LOGIN = "Admin";
    private static final String PASSWORD = "12345";

    public void authenticate() {
        Scanner s = new Scanner(System.in);

        boolean isAuthenticationSuccess = false;
        for (int i = 3; i != 0 && !isAuthenticationSuccess; i--) {
            String login;
            String password;

            System.out.print("Login: ");
            login = s.nextLine();

            System.out.print("Password: ");
            password = s.nextLine();

            if (login.equals(LOGIN)&&password.equals(PASSWORD)) {
                isAuthenticationSuccess = true;
            }
            else {
                System.out.println("Password is incorrect. Please try again. ");
            }
        }

        if (!isAuthenticationSuccess) {
            throw new RuntimeException("Login failed");
        }
    }

}
