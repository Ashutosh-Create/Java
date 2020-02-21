abstract class shape{
	public abstract void area();
}
class Square extends shape{
double a;
Square(double side){
	a=side;
}
public void area(){
	double sqarea=a*a;
	System.out.println("Square area= "+sqarea);
}
}	
class 	Triangle extends shape{
		double h,b;
		Triangle (double height,double base){
			h=height;
			b=base;
		}
		public void area(){
			double trgla=0.5*h*b;
			System.out.println("Triangle area= "+trgla);
		}  }
class   Circle extends shape{
			double a;
			Circle	(double radius){
				a=radius;
			}
			public void area(){
				double Crcla=(3.14*a*a);
				System.out.println("Circle area= "+Crcla);
			}
			}	

public class AS_2_8 {
	public static void main (String args[])
{
shape sq= new Square(4);
shape tr= new Triangle(4,8);
shape cr= new Circle(4);
sq.area();
tr.area();
cr.area();
}
}
