
public class JuniorSavingsAccount extends AccountInfo {
	
String GuardianName;

public JuniorSavingsAccount(String accountNumber, double balance, int pin, String GuardianName) {
	super(accountNumber, balance, pin);

	this.GuardianName = GuardianName;	
	
}



}
