interface Polygon
{
	public abstract void Area();
	public abstract void perimeter();
}
abstract class T1 implements Polygon
{
	abstract public void Area();
	abstract public void perimeter();
}
abstract class Quad1 implements Polygon
{
	abstract public void Area();
	abstract public void perimeter();
}
class Pentagon implements Polygon
{
	double s;
	public  Pentagon(double t)
	{
		s=t;
	}
	public void Area()
	{
		double area=.25*s*s*6.881;
		System.out.println("Area of Pentagon is"+area);
	}
	public void perimeter()
	{
		double perimeter;
		perimeter=5*s;
		System.out.println("Perimeter of Pentagon ="+perimeter);
	}
}
class Hexagon implements Polygon
{
	double b;
	public Hexagon(double c)
	{
		b=c;
	}
	public void Area()
	{
		double area=2.6*b*b;
		System.out.println("Area of Hexagon="+area);
	}
	public void perimeter()
	{
		double perimeter=6*b;
		System.out.println("Perimeter of Hexagon="+perimeter);
	}
}
class IsoscelesTriangle extends T1
{
	double h,b;
	public  IsoscelesTriangle(double c,double d)
	{
		h=c;
		b=d;
	}
	public void Area()
	{
		double area=.5*b*h;
		System.out.println("Area of  Isosceles triangle="+area);
	}
	public void perimeter()
	{
		double perimeter= 2.0*(Math.sqrt(Math.pow(h,2)+Math.pow(b, 2)))+b;
		System.out.println("Perimeter of Isosceles Triangle ="+perimeter);
	}
}
class EquilateralTriangle extends T1
{
double s;
public EquilateralTriangle(double d)
{
	s=d;
}
public void Area()
{
	double area=.433*s*s;
	System.out.println("Area of Equilateral Triangle"+area);
}
public void perimeter()
{
	double perimeter=3*s;
	System.out.println("Perimeter of Equilateral Triangle ="+perimeter);
}

}
class S1 extends Quad1
{
	double s;
	public void setSquare(double t)
	{
		s=t;
	}
	public void Area()
	{
		double area=s*s;
		System.out.println("Area of Square is"+area);
	}
	public void perimeter()
	{
		double perimeter;
		perimeter=5*s;
		System.out.println("Perimeter of Square="+perimeter);
	}
			
}
class rectangle extends Quad1
{
	double l,b;
	
	
		
	public void setRectangle(double t, double p)
	{
		l=t;
		b=p;
	}
	public void Area()
	{
		double area=l*b;
		System.out.println("Area of rectangle is"+area);
	}
	public void perimeter()
	{
		double perimeter;
		perimeter=2*(l+b);
		System.out.println("Perimeter of Rectangle ="+perimeter);
	}	
}
public class prog_10 {

	public static void main(String[] args) 
	{
		EquilateralTriangle e= new EquilateralTriangle(2.2);
		IsoscelesTriangle d= new IsoscelesTriangle(2.2,4.4);
		Pentagon p= new Pentagon(5.2);
		Hexagon r= new Hexagon(5.2);
		p.Area();
		r.Area();
		r.perimeter();
		p.perimeter();
		e.Area();
		e.perimeter();
		d.Area();
		d.perimeter();
		

	}

}

