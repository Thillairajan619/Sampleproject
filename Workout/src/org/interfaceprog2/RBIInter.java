package org.interfaceprog2;

public interface RBIInter {

	abstract void saving();
	abstract void volt();
	public static void current() {
		System.out.println("I am static interface");
	}
	public static void main(String[] args) {
		current();
		
	
		
	}
}
