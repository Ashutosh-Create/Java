import java.util.Scanner;


public class AS_3_1 {

	public static void main(String[] args) {
Scanner sc =new Scanner (System.in);


		System.out.println("Enter your lucky no.");
int l=sc.nextInt();
try{
if (l < 0) { 
throw new NumberFormatException ("That's not positive!");
}
}
catch(Exception e){
	System.out.println(e);
}
	}
	}