package org.interfaceprog2;

public class CSK implements BCCrules {

	

	public void CricketRuls() {
	System.out.println("follow common cricket rules");
	}
  public void bccRules() {
	System.out.println("follow common Bcc rules");
	}
  public static void dressCode() {
	 System.out.println("red");
	}
	
public static void main(String[] args) {
	BCCrules bcc = new CSK();
	bcc.bccRules();
	bcc.CricketRuls();
	dressCode();
	bcc.Rules3();
	BCCrules.Rules2();
	
	
}

}
