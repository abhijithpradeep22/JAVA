import java.util.Scanner;
public class BankAccount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Account Number :");
		String acc_no = s.nextLine();
		System.out.println("Enter Account Holder Name :");
		String acc_h = s.nextLine();
		Account h1 = new Account(acc_no,acc_h);
		while(true){
			System.out.println("Enter 1 For Deposit \n Enter 2 For Withdrawal \n Enter 3 For Account Details \n Enter 4 To Exit");
			int x = s.nextInt();
			switch(x) {
			case 1:
				System.out.println("Enter Amount :");
				double amount = s.nextDouble();
				h1.deposit(amount);
				break;
		
			case 2:
				System.out.println("Enter Amount :");
				double w_amount = s.nextDouble();
				h1.withdraw(w_amount);
				break;
			
			case 3:
				h1.display();
				break;
		
			case 4:
				s.close();
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
}

class Account{
	
	double acc_bal = 0.0;
	String acc_no,acc_h;
	Account(String acc_no,String acc_h){
		this.acc_no = acc_no;
		this.acc_h = acc_h;
		}
	void deposit(double amount ) {
		this.acc_bal += amount;
		System.out.println("Rs. "+amount+" Credited to your Account "+this.acc_no);
		System.out.println("Available Balance : "+this.acc_bal);
	}
	
	void withdraw(double amount) {
		if(amount <= this.acc_bal) {
			this.acc_bal -= amount;
			System.out.println("Rs."+amount+" Debited from your Account "+this.acc_no);
			System.out.println("Available Balance : "+this.acc_bal);
		}
		else {
			System.out.println("Error!! Insufficient Balance");
		}
	}
	
	void display() {
		System.out.println("Account Details  ---");
		System.out.println("Account Number : "+this.acc_no);
		System.out.println("Account Holder : "+this.acc_h);
		System.out.println("Account Balance : "+this.acc_bal);
	}
}
