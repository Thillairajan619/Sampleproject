package org.polymorphism_overloading;

public class LoginWebsite extends LoginPage{

	public void login() {
		super.login();
		System.out.println("LoginWebsite");
	}
	public void login (String name) {
		super.login(name, name, name);
		System.out.println("loginWebsite "+ name);
	}
	public static void main(String[] args) {
		LoginPage lw = new LoginWebsite();
		lw.login();
		lw.login("hi");
		//lw.login("Thillai", "Rajan", "Rolex");
	}
		
	
}
