package org.polymorphism_overloading;

public class LoginPage {

	public void login() {
		System.out.println("No arg");
	}
	public void login(String name) {
		System.out.println("Single arg");
	}
	public void login(String name, String name1) {
	System.out.println("double arg");	
	}
	public void login (String name, String name1, String name2) {
		System.out.println("trible arg");
	}
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.login();
		lp.login("Thillai");
		lp.login("Thillai", "Rajan");
		lp.login("Thillai", "Rajan", "Rolex");
	}
}

