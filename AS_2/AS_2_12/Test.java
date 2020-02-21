package package_1;

import java.util.Scanner;

 class Student {
	String name;
	int roll;
	void input( ){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Name. ");
		name=sc.next();
		System.out.println("Enter RollNo. ");
	roll=sc.nextInt();
	}
	void output( ){
		System.out.println("Name: "+name+" Roll No.: "+roll);
		
	}
}
public class Test extends Student{
	public int mark1;
	public int mark2;
	Scanner sc =new Scanner (System.in);
	public void input( ){
super.input();
System.out.println("Enter mark1. ");
mark1=sc.nextInt();
System.out.println("Enter mark2. ");
mark2=sc.nextInt();
	}
	public void output( ){
	super.output();
	System.out.println("mark1: "+mark1+" mark2: "+mark2);
	}
}