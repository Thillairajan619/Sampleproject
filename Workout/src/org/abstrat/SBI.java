package org.abstrat;

public class SBI extends Axis{
	public void volt() {
		System.out.println("SBI Volt");
		
	}
	
	public static void main(String[] args) {
		Axis s = new SBI();
		s.currentaccount();
		s.saving();
		s.volt();
		
	}
}
