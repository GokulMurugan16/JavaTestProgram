
public class AccountInfo {
	
	String accountNumber;
	double balance;
	int pin;
	static int minimumBalance = 500; 
	
	public AccountInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountInfo(String accountNumber, double balance, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public int getMinimumBalance() {
		return minimumBalance;
	}
	
	public void depositAmount(int amount) {
		if (balance != 0) {
			balance = balance+amount;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdrawAmount(int amount) {
		if (balance > 0 && balance >= amount) {
			balance = balance-amount;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}

		
}
