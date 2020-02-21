import java.util.*;
class person
{
	String name ;
	int age;
	person(String n,int a)
	{
		name =n;
		age =a;
	}
	
}
class student extends person
{
	String course ;
	int roll;
	double mark;
	student(String c,String n ,int r,double m,int a)
	{
		super(n,a);
		course = c;
		roll=r;
		mark =m;
		
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Course:"+course);
		System.out.println("Roll:"+roll);
		System.out.println("Mark:"+mark);
	}
}
 class teacher extends person
 {
	 String subject_assigned;
	 int contact_hour;
	 teacher(String n,int d,String s,int c)
	 {
			super(n,d);
			subject_assigned=s;
			contact_hour=c;

	 }
	 void display()
	 {
		 System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Subject:"+subject_assigned);
			System.out.println("Contact:"+contact_hour);

	 }
 }

public class prog_7 
{

	public static void main(String[] args) 
	{
		
			student ob1=new student("abc","dfs",12,40.9,32);
			teacher ob2=new teacher("b",25,"def",32);
			ob1.display();
			ob2.display();


	}

}
