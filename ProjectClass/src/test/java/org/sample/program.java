package org.sample;

public class program {
public static void main (String [] args) {
	String S = "123456";
	int length = S.length();
	if (length%2==0) {
		int middleindex = length/2;
		char middlechar1 = S.charAt(middleindex-1);
		char middlechar2 = S.charAt(middleindex);
		System.out.println("Middlenumber:" + middlechar1 + middlechar2);
	}
	else {
		int middleindex = length/2;
		char middlechar = S.charAt(middleindex);
		System.out.println(middlechar);
	}
}
}