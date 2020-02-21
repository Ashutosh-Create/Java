import java.util.Scanner;

 class student1
{	String name;
	int roll;
	double mark;


	void setData(String s,int r,double m)
	{
	  name = s;
	  roll = r;
	  mark = m;
		
	}
    void Display()
    {
    	System.out.println(" name = "+name);
    	System.out.println(" roll number = "+roll);
    	System.out.println(" mark = "+mark);
    
    }
}

public class A1Q10 
{

	public static void main(String[] args) 
	{
		student1 ob1=new student1();
		ob1.setData("RAJESH",158,10.78);
		ob1.Display();
		student1 ob2=new student1();
		ob2.setData("RAMESH",123,34.98);
		ob2.Display();
		student1 ob3=new student1();
		ob3.setData("RAKESH",124,19.9);
		ob3.Display();

	}

}
