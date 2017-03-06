package atm;

public class Withdrawal {

	ATM atm;
	Session s;
	Card c;
	double amount;
	
	public Withdrawal(ATM atm, Session s, Card c, double amount) {
		this.atm = atm;
		this.s = s;
		this.c = c;
		this.amount = amount;
	}
	
	@Override
	public String toString(){
		return "Withdrawal at ATM " + atm.getID() + " (" + atm.getCity() + ", " + atm.getBank() + ") of " + amount + 0;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
