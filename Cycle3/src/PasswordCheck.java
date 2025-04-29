import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter password: ");
            String password = s.nextLine();

            try {
                // Check length
                if (password.length() < 8) {
                    throw new Exception("Password must be at least 8 characters long.");
                }
                
                // Check for a number
                if (!password.matches(".*\\d.*")) {
                    throw new Exception("Password must contain at least one number.");
                }

                // Check for a special character ($ # & ))
                if (!password.matches(".*[\\$#&)].*")) {
                    throw new Exception("Password must contain at least one special character ($, #, &, )).");
                }

                // If all checks pass
                System.out.println("Password is valid.");
                break;  // Exit the loop when password is valid

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please re-enter the password.\n");
            }
        }
    }
}
