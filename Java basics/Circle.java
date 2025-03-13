import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		float r=s.nextFloat();
		System.out.println("Area of circle : "+ Math.PI * r *r);
		System.out.println("Perimeter of circle : "+ 2 * Math.PI * r );
		s.close();
		

	}

}
