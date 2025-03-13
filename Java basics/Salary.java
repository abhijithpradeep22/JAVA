import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your job position ( Manager , Developer , Intern ) :");
		String pos = s.nextLine();
		System.out.println("Enter total years of experience");
		int exp = s.nextInt();
		float bonus;
		if (exp > 5) {
			bonus = 20.0f/100;
		}
		else if(exp >= 3 && exp <= 5) {
			bonus = 10.0f/100;
		}
		else {
			bonus = 0;
		}
		if(pos.equals("Manager")) {
			System.out.println(" Manager-Salary : 50,000");
			System.out.println(" After adding experience based BONUS  :\n SALARY : " + (50000 +(bonus*50000)));
		}
		if(pos.equals("Developer")) {
			System.out.println(" Developer-Salary : 30,000");
			System.out.println(" After adding experience based BONUS :  \n SALARY : " + (30000 +(bonus*30000)));
		}
		if(pos.equals("Intern")) {
			System.out.println(" Intern-Salary : 15,000");
			System.out.println(" After adding experience based BONUS : \n SALARY : " + (15000 +(bonus*15000)));
		}
		s.close();
		
		

	}

}
