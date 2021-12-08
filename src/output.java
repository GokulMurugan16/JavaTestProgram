import java.util.Scanner;

public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		AccountInfo a = new AccountInfo();
		
//		a.pin = 1234;
//		a.balance = 50000.00;
//		
//		System.out.println("Enter Your Account Number: ");
//		a.accountNumber = input.next();
//		
//		System.out.println("Enter Your Account Pin: ");
//		int pin = input.nextInt();
//		
//		if(pin == a.pin) {
//			
//			System.out.println("Please Select the transaction :");
//			System.out.println("1. View Balance");
//			System.out.println("2. Amount Withdrawl");
//			System.out.println("3. Amount Deposit");
//			System.out.println("4. Amount Info");
//			
//			switch (input.nextInt()) {
//			
//			case 1:
//				System.out.println("Your Balance is : " + a.balance);
//				break;
//			
//			case 2:
//				System.out.println("Enter the withdrawl amount");
//				a.withdrawAmount(input.nextInt());
//				System.out.println("Your Balance is : " + a.balance);
//				break;
//				
//			case 3:
//				System.out.println("Enter the Deposit amount");
//				a.amountAmount(input.nextInt());
//				System.out.println("Your Balance is : " + a.balance);
//				break;
//				
//			case 4:
//				System.out.println("Account Number:" + a.accountNumber);
//				System.out.println("Your Balance is : " + a.balance);
//				break;
//				
//			default:
//				System.out.println("Please enter a valid choice.");
//			
//			}
//			
//		}
//		
//		else {
//			System.out.println("Incorrect Pin");
//		}
//		
		
		System.out.println("Enter the radius of the circle");
		float radius = input.nextFloat();
		Circle c = new Circle();
		System.out.println("Area of the circle : "+ c.area(radius));
		System.out.println("Circumference of the circle : "+ c.circumference(radius));
		
		
	}

}
