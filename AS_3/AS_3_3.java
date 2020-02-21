import java.util.Scanner;

class MarksOutOfBoundException extends Exception{
	String s1;
	MarksOutOfBoundException(String s1){
		this.s1=s1;
	}
	public String toString(){
		return "MarksOutOfBoundException "+s1;
		
	}
}
public class AS_3_3 {
public static void main(String args[]){
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter student name & marks");
	String n=sc.next();
	int m=sc.nextInt();

	try{if(m>100){
		MarksOutOfBoundException e=new MarksOutOfBoundException(n);
	String p=e.toString();

	System.out.println(p);
	}
	
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
