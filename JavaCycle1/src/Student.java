import java.util.Scanner;
public class Student {
	
	int std_id;
	String name;
	double marks;
	
	Student(int std_id,String name,double marks){   //Constructor
		this.std_id = std_id;
		this.name = name;
		this.marks = marks;
	}
	
	void displayDetails() {
		System.out.println("-----Details of Student -----");
		System.out.println("	Student ID : "+std_id);
		System.out.println("	Name       : "+name);
		System.out.println("	Mark       : "+marks);

	}
	
	boolean isPassed() {
		if(marks >= 40) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			
			System.out.println("\n \nEnter student ID (-1 To EXIT ): ");
			int std_id = s.nextInt();
			if(std_id == -1) {
				break;
			}
			s.nextLine();   //To read /n after pressing ENTER 
			System.out.println("Enter student name : ");
			String name = s.nextLine();
			System.out.println("Enter student Mark : ");
			double marks = s.nextDouble();
			
			Student obj = new Student(std_id,name,marks);
			obj.displayDetails();
			if(obj.isPassed()) {
				System.out.println("	Status     : PASSED");
			}
			else {
				System.out.println("	Status     : FAILED!!");

			}			
		}
		s.close();
	}
}
