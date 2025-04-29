import java.util.Arrays;
import java.util.Scanner;
public class SortArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total number of strings");
		int n = s.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter strings");
		for (int i =0 ;i < n;i++) {
			arr[i] = s.next();
		}
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for (int i =0 ;i < n;i++) {
			System.out.println(arr[i]);
		}
		s.close();

	}

}
