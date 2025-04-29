import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int temp = num ;
		int temp1 = num;
		int n = 0;
		while (temp >0) {
			temp = temp/10;
			n++;
		}
		int r;
		int sum = 0;
		while (temp1>0) {
			r = temp1 % 10 ;
			sum = sum + ((int)Math.pow(r, n));
			temp1 = temp1/10;
		}
		if (sum == num) {
			System.out.println(num + " Is Armstrong Number");
		}
		else {
			System.out.println(num +" Is Not Armstrong Number");
		}
		s.close();
	}
}
