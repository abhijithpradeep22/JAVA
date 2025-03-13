import java.util.Scanner;
public class VowelConsonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = s.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) { // Check letter
                if ("aeiou".contains(ch + "")) vowels++;
                else consonants++;
            }
       }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        s.close();
    }
}
