import java.util.*;
class pointtype
{
	int x,y;
	public void input1()
	{
		System.out.println("enter the x coordinate: ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter the y coordinate :");
		y=sc.nextInt();
	}

	public void display1()
	{
		System.out.println("x Coordinate: "+x);
		System.out.println("y coordinate: "+y);
	}

}
class circletype extends pointtype
{
	 int x1,x2,y1,y2;
	double r,i,j,ar,ci;
	 public void input()
	{
		System.out.println("enter the details of circle: ");
		Scanner sc=new Scanner(System.in);
		super.input1();
		
		
		x1=super.x;
		y1=super.y;
		System.out.println("enter the x and y coordinate: ");
		super.input1();
		x2=super.x;
		y2=super.y;
		}
public void radius()
{
	i=Math.pow((x2-x1),2);
	j=Math.pow((y2-y1),2);
	r=Math.sqrt(i+j);
	ar=(3.14*r*r);
	ci=(2*3.14*r);
}
public void displayresult()
	{
	    System.out.println("the details of circle is: ");
	
		System.out.println("radius : "+r);
		System.out.println("area: "+ar);
		System.out.println("Circumference:"+ci);
	}
}
public class point
{

	public static void main(String[] args)
	{
		int i;	
		circletype s=new circletype();

		s.input();
		s.radius();
		s.displayresult();
	}

}

