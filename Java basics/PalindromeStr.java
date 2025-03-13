import java.util.Scanner;
public class PalindromeStr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.nextLine();
		str = str.toLowerCase();
		int left=0;
		int right= str.length()-1;
		boolean ispalindrome = true;
		while(left < right) {
			if(str.charAt(left)!=str.charAt(right)) {
				ispalindrome = false;
				break;
			}
			left++;
			right--;
		}
		if(ispalindrome) {
			System.out.println(str +" is Palindrome ");
		}
		else {
			System.out.println(str +" is Not Palindrome ");

		}
		s.close();

	}

}
