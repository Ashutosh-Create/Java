import java.util.Scanner;


class PointType{
	int x,y;
	void Set_point(){
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void Display_point(){
		System.out.println("("+x+","+y+")");
	}
}
class CircleType extends PointType{
	double radius;
	void distance(CircleType c1,CircleType c2){
		int m =c1.x-c2.x;
		int m2 =c1.y-c2.y;
		radius=Math.sqrt(Math.pow((m), 2)+ Math.pow((m2 ), 2));
		System.out.println("Radius ="+radius);
	}

	double area(){
		return 3.14*radius*radius;
	}
	double circumference(){
		return 3.14*radius*2;
	}
}


public class AS_2_4 {

	public static void main(String[] args) {
		CircleType c=new CircleType ();
		CircleType c1=new CircleType();
		CircleType c2=new CircleType();
		System.out.println("Enter coordinates of centre.");
		c.Set_point();
		System.out.println("Enter coordinates of a point on circle.");
		c1.Set_point();
		c2.distance(c,c1);
double a=c2.area();
double cr=c2.circumference();

c. Display_point();c1. Display_point();
System.out.println("Area= "+a+" Circumference= "+cr);
	}

}
