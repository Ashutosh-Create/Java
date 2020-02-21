import java.util.Scanner;
class point
{
	double x;
	double y;
	void setPoint()
	{
		Scanner s= new Scanner (System.in);
		System.out.println("enter the points" );
		x=s.nextDouble();
		y =s.nextDouble();
		
	}
	public void findDistance(double p1,double p2)
	{
		p1=x;
		p2=y;
 double d =Math.sqrt((p2*p2)-(p1*p1));
 System.out.println("distance ="+d);
	}
	
}
public class PROG_11 
{

	public static void main(String[] args) 
	{
		point p =new point ();
		p.setPoint();
		p.findDistance(0, 0);

	}
}
