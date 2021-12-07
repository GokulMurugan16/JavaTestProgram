
public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountInfo a = new AccountInfo();
		
		a.accountNumber = 123;
		a.balance = 5000;
		a.pin = 1234;
		
		System.out.println(a.accountNumber);
		System.out.println(a.balance);
		System.out.println(a.pin);
		
		a.withdrawAmount(2500);
		System.out.println(a.balance);
		
		a.withdrawAmount(2500);
		System.out.println(a.balance);
		
	}

}
