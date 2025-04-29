import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = s.nextInt();
        s.nextLine(); //leftover newline
        String[] words = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            words[i] = s.nextLine();
        }
        Arrays.sort(words);
        System.out.println("Sorted strings: " + String.join("\n", words));
        s.close();
    }
}
