import java.util.*;
abstract class shape
{
 abstract 	void print ();

}
 class square extends shape 
{
    void print ()
    {
    System .out.println(" Area of Square = ");
    }
    double area (double s)
    {
    	return s*s;
    }
}  
  class triangle extends shape 
{
    void print ()
    {
    System .out.println(" Area of Triangle =");
    }
    double area (double b,double h)
    {
    	return 0.5*b*h ;
    }
}
 class circle  extends shape 
{
    void print ()
    {
    System .out.println(" Area of circle =");
    }
    double area (double r)
    {
    	return r*r*3.141;
    }
}
public class Prog_8
{
   public static void main (String args[])
   {
	   double r,s,b,h;
	   Scanner sc=new Scanner (System.in);   
	   System.out.println("enter the side of square ");
	   s=sc.nextDouble();
	   square  p =new square();
	   p.print();
	   double area =p.area(s);
	   System.out.println(area);
	   System.out.println(" enter the length and bredth of a triangle ");
	   b=sc.nextDouble();
	   h=sc.nextDouble();
	   triangle t = new triangle () ;
	   t.print();
	   double area1 = t.area(b,h);
	   System.out.println(area1);
	   System.out.println("enter the radius of a circle ");
	   r =sc.nextDouble();
	   circle c =new circle ();
	   c.print();
	   double a =c.area(r);
	   System.out.println(a);	   	   
   }
}
