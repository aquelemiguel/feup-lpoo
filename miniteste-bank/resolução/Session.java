package atm;

public class Session implements Countable {

	ATM atm;
	int transactions;

	public Session(ATM atm) {
		this.atm = atm;
		this.transactions = 0;
	}

	public ATM getATM() {
		return atm;
	}

	public void addTransaction(Withdrawal w) {
		this.transactions++;
	}

	public void addTransaction(Deposit d) {
		this.transactions++;
	}
	
	@Override
	public boolean equals(Object obj){
		Session that = (Session) obj;
		if (this.atm.getID() == that.atm.getID()){
			return true;
		}
		return false;
	}

	public int count() {
		return this.transactions;
	}

}
