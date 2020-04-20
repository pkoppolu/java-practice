package com.core.java.constructors;

public class ParameterizedConstructor2 {
	String pno;
	String name, mailid;

	ParameterizedConstructor2()// Default Constructor
	{
		System.out.println("Please fill your details!!!");
	}

	ParameterizedConstructor2(String name)// 1Arg Constructor
	{
		this.name = name;
	}

	ParameterizedConstructor2(String pno, String name)// 2Arg Constructor
	{
		this.pno = pno;
		this.name = name;
	}

	ParameterizedConstructor2(String pno, String name, String mailid)//// Multiple-Arg Constructor
	{
		this.pno = pno;
		this.name = name;
		this.mailid = mailid;
	}

	public static void main(String args[]) {
		ParameterizedConstructor2 p1 = new ParameterizedConstructor2();
		ParameterizedConstructor2 p2 = new ParameterizedConstructor2("Prudhvi");
		ParameterizedConstructor2 p3 = new ParameterizedConstructor2("9704390429", "Rishi");
		ParameterizedConstructor2 p4 = new ParameterizedConstructor2("Chitti", "chitti123@gmail.com", "2172203879");
		System.out.println(p2.name + " ");
		System.out.println(p3.pno + " " + p3.name + " ");
		System.out.println(p4.pno + " " + p4.name + " " + p4.mailid + " ");
	}
}
