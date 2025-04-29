import java.util.Scanner;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phoneNumber = s.nextLine();

        try {
            // Check if phone number has exactly 10 digits
            if (phoneNumber.length() != 10 || !phoneNumber.matches("[0-9]+")) {
                throw new Exception("Phone number must have exactly 10 digits.");
            }

            System.out.println("Phone number is valid.");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        s.close();  
    }
}
