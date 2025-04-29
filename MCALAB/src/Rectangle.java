import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int l = s.nextInt();
		int b = s.nextInt();
		System.out.println("Area = "+l*b);
		System.out.println("Perimeter =" + 2*(l+b));
		s.close();
	}
}
