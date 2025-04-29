import java.util.Scanner;

abstract class Employee{
	String name;
	int id;
	Employee(String name,int id){
		this.name = name;
		this.id = id;
	}
	
	void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
	}
	
	abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
	
	FullTimeEmployee(String name,int id){
		super(name,id);
	}
	void calculateSalary() {
		System.out.println("\nSalary : Rs. 70,000.00");
	}
}
class PartTimeEmployee extends Employee{
	int hours;
	PartTimeEmployee(String name,int id,int hours){
		super(name,id);
		this.hours = hours;
	}
	void calculateSalary(){
		int rate = 100;
		System.out.println("Enter Total number of hours worked : "+hours);
		System.out.println("Rate per Hour : "+rate);
		System.out.println("\nSalary : Rs."+(rate*hours));
	}
}


public class abstractClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String name;
			int id;
			System.out.println("\n\nEnter 1 to calculate salary of Full Time Employee \nEnter 2 to calculate salary of Part Time Employee \nEnter 0 to EXIT \n");
			int ch = s.nextInt();
			if(ch == 0) {
				break;
			}
			s.nextLine();
			System.out.println("Enter your Name : ");
			name = s.nextLine();
			System.out.println("Enter your ID : ");
			id = s.nextInt();
			
			if(ch == 1) {
				FullTimeEmployee f = new FullTimeEmployee(name,id);
				f.displayDetails();
				f.calculateSalary();
			}
			else if(ch == 2) {
				System.out.println("Enter total number of hours worked : ");
				int hours = s.nextInt();
				PartTimeEmployee p = new PartTimeEmployee(name,id,hours);
				p.displayDetails();
				p.calculateSalary();
			}
			else {
				System.out.println("Invalid Choice!!");
			}
			
		}
	  s.close();
	}
	
}
