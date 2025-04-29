import java.util.Scanner;

public class Rectangle {
	
	double length,width;
	Rectangle(){				//Default Constructor
		length = 1;
		width = 1;
	}
	
	Rectangle(double l , double w){ 	//parameterized constructor
		length = l;
		width = w;
	}
	
	double calculateArea() {		 // Method to calculate area
		return (length * width);
	}
	
	double calculatePerimeter() {		 // Method to calculate perimeter
		return(2*(length + width));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			
			System.out.println("\nEnter length of the rectangle OR Enter -1 to EXIT ");
			double l = s.nextDouble();
			if(l == -1) {
				break;
			}
			System.out.println("Enter width of the rectangle ");
			double w = s.nextDouble();
			
			Rectangle obj = new Rectangle();
			System.out.println("\n \nArea of Rectangle (Default Constructor) = "+obj.calculateArea());
			System.out.println("Perimeter of Rectangle (Default Constructor) = "+obj.calculatePerimeter());
			
			Rectangle obj1 = new Rectangle(l,w);
			System.out.println("Area of Rectangle = "+obj1.calculateArea());
			System.out.println("Perimeter of Rectangle = "+obj1.calculatePerimeter());
			
		}
		s.close();
		System.out.println("Program EXITED");
		}	
}
