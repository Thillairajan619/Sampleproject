package org.interfaceprog2;

public class SBI implements RBIInter, AxisInter {
	@Override
	public void axisSaving() {
		System.out.println("axis Saving");
	}
	@Override
	public void axisVoult() {
		System.out.println("Axis voult");
	}
	
	public void SBISavings() {
		System.out.println("SBI Saving");
	}
	
	public void SBIVoult() {
		System.out.println("SBI voult");
	}
	
	@Override
	public void saving() {
		System.out.println("RBI saving");
		
	}
	@Override
	public void volt() {
		System.out.println("RBI volt");
		
	}
	public static void main(String[] args) {
		
		RBIInter r = new SBI();
		r.saving();
		r.volt();
		
		AxisInter a = new SBI();
		a.axisSaving();
		a.axisVoult();
		
		SBI s = new SBI();
		s.SBISavings();
		s.SBIVoult();
			
		}
		
	
	
		
	}
		
	

