package org.encapsulation;



public class Customer {
	public static void main(String[] args) {
		Bank bb = new Bank ();
		bb.setBank(5688);
		bb.setTransactionLimit(5550000);
		System.out.println(bb.getSBank());
		System.out.println(bb.getTransactionLimit());
	}

}
