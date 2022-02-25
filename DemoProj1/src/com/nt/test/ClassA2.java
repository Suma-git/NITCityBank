package com.nt.test;

public class ClassA2 {
	
	void meth1(int a,int b,String operator) {
		switch(operator) {
		case "+":
			System.out.println("addition : "+(a+b));
			break;
		case "-":
			System.out.println("subtraction : "+(a-b));
			break;
		case "*":
			System.out.println("multiplication : "+(a*b));
			break;
		case "/":
			System.out.println("division : "+(double)a/b);
			break;
			default:
				System.out.println("enter correct operator ");
				break;
		}
	}
	
	public static void main(String[] args) {
		ClassA2 aobj = new ClassA2();
		aobj.meth1(6, 3, "+");
		aobj.meth1(6, 8, "-");
		aobj.meth1(6, 3, "*");
		aobj.meth1(6, 4, "/");
	}

}
