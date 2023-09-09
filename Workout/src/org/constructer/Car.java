package org.constructer;

public class Car {
    String name;
    String model;
    String speed;
    
   Car() {
	  this("RDX");
	  System.out.println(" im no arg can of parent class");
  }

   Car(String model) {
	this ("Renault",120.0);
	System.out.println("im single arg con of parent class");
}

   Car(String model, double speed) {
	System.out.println("im double arg con of parent class");
}
  public static void main(String[] args) {
	Car car1 = new Car();

  }

}
