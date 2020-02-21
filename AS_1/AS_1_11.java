import java.util.Scanner;


class Point{
int x,y;
void setPoint(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter coordinates.");
x=sc.nextInt();
y=sc.nextInt();

}
void findDistance(Point p1,Point p2){
	int m =p1.x-p2.x;
	int m2 =p1.y-p2.y;
	
double	d=Math.sqrt(Math.pow((m), 2)+ Math.pow((m2), 2));
System.out.println("Distance ="+d);
	
}

}
public class AS_1_11 {

		public static void main(String [] args) {
			Point s1=new Point();
			Point s2=new Point();
			Point s3=new Point();
			s1.setPoint();
			s2.setPoint();
			s3.findDistance(s1,s2);
	
	}

}
