import java.util.*;
interface Polygon
{
	void area();
	void perimeter();
}
abstract class Triangle
{
	int a,b,c;
	double res;
	double peri;
}
abstract class Quadrilateral 
{

	int a,b,c,d;
	double res;
	double peri;
}
class Pentagon implements Polygon
{
	double res;
	double peri;
	int a;
	Pentagon(int p)
	{
		a=p;
	}
	public void area()
	{
		res=(1/4)*Math.sqrt(5*(5+2*Math.sqrt(5)))*a*a;
	}
	public void perimeter()
	{
		peri=5*a;
	}
	public void show()
	{
		System.out.println("Area --> "+res);
		System.out.println("Perimeter --> "+peri);
	}
}
class Hexagon implements Polygon
{
	double res;
	double peri;
	int a;
	Hexagon(int p)
	{
		a=p;
	}
	public void area()
	{
		res=(3*Math.sqrt(3)*a*a)/2;
	}
	public void perimeter()
	{
		peri=6*a;
	}
	public void show()
	{
		System.out.println("Area --> "+res);
		System.out.println("Perimeter --> "+peri);
	}
}
class Octagon implements Polygon
{
	double res;
	double peri;
	int a;
	Octagon(int p)
	{
		a=p;
	}
	public void area()
	{
		res=2*(1+Math.sqrt(2))*a*a;
	}
	public void perimeter()
	{
		peri=8*a;
	}
	public void show()
	{
		System.out.println("Area --> "+res);
		System.out.println("Perimeter --> "+peri);
	}
}
class IsoscelesTriangle extends Triangle implements Polygon
{
	int b,h;
	IsoscelesTriangle(int p,int q)
	{
		b=p;
		h=q;
	}
	public void area()
	{
		double hi=Math.sqrt((h*h)-((b/2)*(b/2)));
		res=0.5*hi*b;
	}
	public void perimeter()
	{
		peri=h+h+b;
	}
	public void show()
	{
		System.out.println("Area --> "+res);
		System.out.println("Perimeter --> "+peri);
	}
}
class EquilateralTriangle extends Triangle implements Polygon
{
	int a;
	EquilateralTriangle(int p)
	{
		a=p;
	}
	public void area()
	{
		res=(Math.sqrt(3)*a*a)/4;
	}
	public void perimeter()
	{
		peri=3*a;
	}
	public void show()
	{
		System.out.println("Area --> "+res);
		System.out.println("Perimeter --> "+peri);
	}
}
class Rectangle extends Quadrilateral implements Polygon
{
	int l,b;
	Rectangle(int p,int q)
	{
		l=p;
		b=q;
	}
	public void area()
	{
		res=l*b;		
	}
	public void perimeter()
	{
		peri=2*(l+b);
	}
	public void show()
	{
		System.out.println("Area --> "+res);
		System.out.println("Perimeter --> "+peri);
	}
}
class Square extends Quadrilateral implements Polygon
{
	int l;
	Square(int p)
	{
		l=p;
	}
	public void area()
	{
		res=l*l;
	}
	public void perimeter()
	{
		peri=4*l;
	}
	public void show()
	{
		System.out.println("Area --> "+res);
		System.out.println("Perimeter --> "+peri);
	}
}
public class AS_2_10 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Polygon Calculator");
		System.out.println("Enter the Polygon Name and its Dimension and we will show u its Perimeter and Area");
		System.out.println("Enter : ");
		System.out.println("1 for Triangle");
		System.out.println("2 for Quadrilateral");
		System.out.println("3 for Pentagon");
		System.out.println("4 for Hexagon");
		System.out.println("5 for Octagon");
		System.out.print("Your choice : ");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
		{
			System.out.println("TRIANGLE");
			System.out.println("Enter : ");
			System.out.println("1 for Isosceles Triangle");
			System.out.println("2 for Equilateral Triangle");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("ISCOSCELES TRIANGLE");
				System.out.println("Enter Hypotenuse(2 same sides)");
				int x=sc.nextInt();
				System.out.println("Enter Base");
				int y=sc.nextInt();
				IsoscelesTriangle ob=new IsoscelesTriangle(x,y);
				ob.perimeter();
				ob.area();
				ob.show();
			}
			else if(ch==2)
			{
				System.out.println("EQUILATERAL TRIANGLE");
				System.out.println("Enter Side");
				int y=sc.nextInt();
				EquilateralTriangle ob=new EquilateralTriangle(y);
				ob.perimeter();
				ob.area();
				ob.show();
			}
			else
			{
				System.out.println("Invalid Input");
			}
			break;
		}
		case 2:
		{
			System.out.println("QUADILATERAL");
			System.out.println("Enter : ");
			System.out.println("1 for Rectangle");
			System.out.println("2 for Square");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("RECTANGLE");
				System.out.println("Enter Length");
				int x=sc.nextInt();
				System.out.println("Enter Breadth");
				int y=sc.nextInt();
				Rectangle ob=new Rectangle(x,y);
				ob.perimeter();
				ob.area();
				ob.show();
			}
			else if(ch==2)
			{
				System.out.println("SQUARE");
				System.out.println("Enter Side");
				int y=sc.nextInt();
				Square ob=new Square(y);
				ob.perimeter();
				ob.area();
				ob.show();
			}
			else
			{
				System.out.println("Invalid Input");
			}
			break;
		}
		case 3:
		{
			System.out.println("PENTAGON");
			System.out.println("Enter its Side");
			int x=sc.nextInt();
			Pentagon ob=new Pentagon(x);
			ob.perimeter();
			ob.area();
			ob.show();
			break;
		}
		case 4:
		{
			System.out.println("HEXAGON");
			System.out.println("Enter its Side");
			int x=sc.nextInt();
			Hexagon ob=new Hexagon(x);
			ob.perimeter();
			ob.area();
			ob.show();
			break;
		}
		case 5:
		{
			System.out.println("OCTAGON");
			System.out.println("Enter its Side");
			int x=sc.nextInt();
			Octagon ob=new Octagon(x);
			ob.perimeter();
			ob.area();
			ob.show();
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
			break;
		}
		}
	}

}
