import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();
		int t =n;
		int r=0;
		while (t>0) {
			r= r * 10 + (t % 10);
			t= t / 10;
		}
		if(n==r) {
			System.out.println(n+ " Is palindrome");
		}
		else {
			System.out.println(n+ " Is Not palindrome");
		}
		s.close();

	}

}
