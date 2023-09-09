package org.encapsulation;

public class Bank {
	private int SBank;
	private int TransactionLimit;
	
	public void setBank (int amt) {
		SBank = amt;
	}
	public void setTransactionLimit(int amt) {
		TransactionLimit = amt;
	}
	public int getSBank() {
		return SBank;
		
	}
		public int getTransactionLimit() {
			return TransactionLimit;
			
		}
}
