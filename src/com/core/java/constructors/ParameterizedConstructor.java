package com.core.java.constructors;

public class ParameterizedConstructor {
	String name;
	int roll;

	ParameterizedConstructor(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public static void main(String args[]) {
		ParameterizedConstructor p1 = new ParameterizedConstructor("Rishi", 111);
		ParameterizedConstructor p2 = new ParameterizedConstructor("Rithvi", 222);
		ParameterizedConstructor p3 = new ParameterizedConstructor("Ved", 333);
		ParameterizedConstructor p4 = new ParameterizedConstructor("Riya", 444);
		System.out.println(p1.name+" "+p1.roll+", "+p2.name+" "+p2.roll+", "+p3.name+" "+p3.roll+", "+p4.name+" "+p4.roll+". ");
/*		System.out.println(p2.name+" "+p2.roll);
		System.out.println(p3.name+" "+p3.roll);
		System.out.println(p4.name+" "+p4.roll);
*/		
	}
}
