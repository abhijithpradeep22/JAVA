import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = s.nextInt();
		int a = 1;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i =2;i<n;i++) {	
			int t = a+b;
			a = b;
			b = t; 
			System.out.println(b);
		}
		s.close();
	}
}
