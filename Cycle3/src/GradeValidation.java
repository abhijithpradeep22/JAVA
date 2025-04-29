import java.util.Scanner;

// Custom exception for invalid grade
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the grade input
        System.out.print("Enter the grade (A to F): ");
        String grade = scanner.nextLine().toUpperCase();  // Convert input to uppercase to handle lowercase input

        try {
            // Check if the grade is valid (between 'A' and 'F')
            if (grade.length() != 1 || grade.compareTo("A") < 0 || grade.compareTo("F") > 0) {
                throw new InvalidGradeException("Invalid grade entered. Please enter a grade between 'A' and 'F'.");
            }

            // If grade is valid, print success message
            System.out.println("Grade " + grade + " is valid.");

        } catch (InvalidGradeException e) {
            // Handle invalid grade exception
            System.out.println(e.getMessage());
        }

        scanner.close(); 
    }
}
