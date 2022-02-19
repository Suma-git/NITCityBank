package com.nt.test;
//dummy 2
public class ClassA1 {

	static int a=0;
	int b=0;

	ClassA1()
	{
	a++;
	b++;
	System.out.println("static var-->"+a);
	System.out.println("instance var--->"+b);
	System.out.println("___________");
	}
	void display(){
	System.out.println("Accessing static var");
	System.out.println(ClassA1.a);
	System.out.println(a);
	System.out.println(new ClassA1().a);
	}

	public static void main(String[] args){
	
	new ClassA1();
	new ClassA1();
	new ClassA1();
	System.out.println("##############");
	new ClassA1().display();
	}
}
