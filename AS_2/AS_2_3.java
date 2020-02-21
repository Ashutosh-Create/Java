import java.util.Scanner;

public class AS_2_3{
	public static void main(String args[]){
		Exam []e=new Exam[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			e[i]=new Exam();
		}	System.out.println("Enter roll no.,name,course of 5 students.");
		for(int i=0;i<5;i++){
			e[i].input_Student(sc.nextInt(),sc.next(), sc.next()) ;
		}
		for(int i=0;i<5;i++){
			e[i].display_Student(); ;
		}
		for(int i=0;i<5;i++){
			e[i]=new Exam();
		}	System.out.println("Enter Marks of 3 subjects of 5 students.");
		for(int i=0;i<5;i++){
			e[i].input_Marks(sc.nextInt(),sc.nextInt(), sc.nextInt()) ;
		}
		for(int i=0;i<5;i++){
			e[i].display_Result();
		}
	}
	}
class Student {
	int rollno;
	String name;
	String course;
	void input_Student (int r,String n,String c){
rollno=r;
name=n;
course=c;
	}
	void display_Student (){
		System.out.println("Roll no.: "+rollno+" Name: "+name+" Course: "+course);
	}
}
class Exam extends Student{
int	mark1, mark2, mark3;
void input_Marks (int m,int m1,int m2) {
	mark1=m; 
	mark2=m1; 
	mark3=m2;
}
void display_Result (){
	System.out.println("Marks of subject 1: "+mark1+" subject 2: "+mark2+" subject 3: "+mark3);
	
	}

}

