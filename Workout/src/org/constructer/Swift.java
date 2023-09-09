package org.constructer;

public class Swift extends Car{

	public Swift() {
		this ("hi");
	System.out.println("no arg");	
	}
public Swift(String a) {
	this(8);
	
	System.out.println("one arg");	
	}
public Swift(int a) {
	super();
	System.out.println("two arg");
}
public static void main(String[] args) {
	Swift s = new Swift();
	
}
}
