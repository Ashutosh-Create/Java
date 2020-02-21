import java.util.Scanner;


public class Commission_object {
public static void main (String []args){

	Demo d=new Demo();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of sales.");
	int s=sc.nextInt();
	d.validation(s);
	
}
}
