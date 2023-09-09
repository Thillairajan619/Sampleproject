package org.elm;

import java.util.ArrayList;

public class Guide {
	public static void main (String [] args) {
	
    ArrayList <Integer> ar1 = new ArrayList <>();
                       ar1.add(20);
                       ar1.add(30);
                       ar1.add(40);
                       ar1.add (60); 
                       ar1.add(80);
                       
      ArrayList <Object> ar = new ArrayList <>();
                       ar.add("Java");
                       ar.add("phython");
                       ar.add("Html");
                       ar.add ("Java");
                       ar.addAll(ar1);                   
 System.out.println(ar);                     
ar.removeAll(ar1);
System.out.println(ar);
	}
}
