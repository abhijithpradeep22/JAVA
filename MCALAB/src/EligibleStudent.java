import java.util.Scanner;
public class EligibleStudent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Marks for following subjects \n"); //comments
		System.out.println("PHYSICS");
		int phy = s.nextInt();
		System.out.println("CHEMISTRY");
		int che = s.nextInt();
		System.out.println("MATHS");
		int mat = s.nextInt();
		int total = phy+che+mat;
		if(mat>=60 && phy >=50 && che >= 40 && total >=200) {
			System.out.println("Eligible");
		}
		else if(mat+phy >= 150) {
			System.out.println("Eligible");
		}
		else{
			System.out.println("Not Eligible");
		}
		s.close();
	}
}
