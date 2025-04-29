import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total percentage of mark obtained \n");
		float mark = s.nextFloat();
		if (mark >= 90) {
			System.out.println(" A Grade \n Excellent Work ");
		}
		else if (mark >= 80) {
			System.out.println(" B Grade \n Good Job ");
		}
		else if (mark >= 70) {
			System.out.println(" C Grade \n You can do better ");
		}
		else if (mark >= 60) {
			System.out.println(" D Grade \n Work Harder ");
		}
		else{
			System.out.println(" Failed !! \n Try Again !! ");
		}
		s.close();
		

	}

}
