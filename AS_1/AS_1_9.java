import java.util.*;
class Student
{
	String name;
	int rollnum;
	float mark;
	void setData(String s,int n,float m)
	{
		name=s;
		rollnum=n;
		mark=m;
	}
	void Display()
	{
		System.out.println("Name = "+name+" Roll Number = "+rollnum+" Mark = "+mark);
	}
}
public class AS_1_9
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setData("Raj",11,56);
		s1.Display();
		Student s2=new Student();
		s2.setData("Raja",12,58);
		s2.Display();
		Student s3=new Student();
		s3.setData("Rahul",13,59);
		s3.Display();
	}
}