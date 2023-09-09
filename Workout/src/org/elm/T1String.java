package org.elm;

public class T1String {
	public static void main (String [] args) {
String name = "AiitetEchnlogy";
System.out.println(name);
/*int length = name.length();
System.out.println(length);
 boolean equals=name.equals("Aiite Technology");
 System.out.println(equals);
 boolean empty = name.isEmpty();
System.out.println(empty);
boolean equalsignorecase = name.equalsIgnoreCase("Aiite Technology");
System.out.println(equalsignorecase);
String substring =	name.substring(5);
System.out.println(substring);
String concat = name.concat("PVT");
System.out.println(concat);
Boolean conatins =name.contains("logy");
System.out.println(conatins);
String replace=name.replace("tEchnlogy", "Electrical");
System.out.println(replace);
int indexof = name.indexOf("E");	
System.out.println(indexof);	*/
String trim = name.trim();
	System.out.println(trim);
String uppercase=name.toUpperCase();
	System.out.println(uppercase);
String lowercase = name.toLowerCase();
System.out.println(lowercase);
System.out.println(name.isEmpty());
System.out.println(name.isBlank());
String date = "06";
String month = "05";
String year = "1999";
String join = String.join("/", date,month,year);
System.out.println(join);
System.out.println(date+"/"+month+"/"+year );
	
	}
}