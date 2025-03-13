import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String text = s.nextLine();

        System.out.print("Enter the word to search: ");
        String searchWord = s.nextLine();

        System.out.print("Enter the replacement word: ");
        String replaceWord = s.nextLine();
        String newText = text.replace(searchWord, replaceWord);

        System.out.println("Updated string: " + newText);

        s.close();
    }
}
