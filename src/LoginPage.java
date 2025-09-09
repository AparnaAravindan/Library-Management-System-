import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        // Predefined correct details (you can change these)
        String correctUsername = "admin";
        String correctPassword = "1234";
        String correctRegisterNo = "REG001";

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();

        // Validation
        if(username.equals(correctUsername) && password.equals(correctPassword) && regNo.equals(correctRegisterNo)) {
            System.out.println("✅ Login Successful! Welcome " + username);
        } else {
            System.out.println("❌ Login Failed! Invalid credentials.");
        }

        sc.close();
    }
}