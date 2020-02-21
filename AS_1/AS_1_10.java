import java.util.Scanner;

class Student1{
	String name;
	int rollno;
	double mark;
	void SetData(String n,int r,double m){
	name=n;
	rollno=r;
mark=m;
	}
	void Display(){
		System.out.println("Name:"+name+" roll no.:"+rollno+" marks:"+mark);
			
}
}
public class AS_1_10 {
	public static void main(String [] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		Scanner sc=new Scanner(System.in);
	
		s1.SetData("Manshi",21,100);
		s2.SetData("Rani",39,87);
		s3.SetData("Abjshag",39,87);
		s1.Display();
		s2.Display();
		s3.Display();
	
	
	}
}
