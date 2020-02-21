import java.util.Scanner;

 class student
{
	int roll;
	double mark;
	String name;

	void setData()
	{
		Scanner s =new Scanner (System.in);
		int r,m;
		String n;
		System.out.println(" enter the name of the student ");
		name =s.next();
		System.out.println("enter roll number of  student ");
		roll =s.nextInt();
		System.out.println("enter mark of the student ");
		mark=s.nextDouble();
		
	}
    void Display()
    {
    	System.out.println(" name = "+name);
    	System.out.println(" roll number = "+roll);
    	System.out.println(" mark = "+mark);
    
    }
}

 public class studentdetails
{

	public static void main(String[] args)
	{
		student ob1=new student();
		ob1.setData();
		ob1.Display();
		student ob2=new student();
		ob2.setData();
		ob2.Display();
		student ob3=new student();
		ob3.setData();
		ob3.Display();

	}

}
