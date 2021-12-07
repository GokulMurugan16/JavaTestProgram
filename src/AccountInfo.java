
public class AccountInfo {
	
	int accountNumber;
	float balance;
	int pin;
	
	public void amountAmount(int amount) {
		if (balance > 0 && balance > amount) {
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
