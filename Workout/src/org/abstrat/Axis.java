package org.abstrat;

public class Axis extends RBI {

	@Override
	public void saving() {
		System.out.println("Axis Saving");
	}

	@Override
	public void volt() {
		System.out.println("Axis Volt");
		
	}
	public static void main(String[] args) {
		RBI a = new Axis();
		a.volt();
		a.saving();
		a.currentaccount();
	}
	

}
