import java.util.*;
public class PROG_1 
{

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s = new Scanner (System.in);
		System.out.println(" enter three integers");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if(a==b+c) 
			System.out.println("a=b+c is a correct arithmetic formula");
		else 
			System.out.println("a=b+c is not  a correct arithmetic formula");
		if(a == b-c)
			System.out.println("a=b-c is a correct arithmetic formula");
		else
		    System.out.println("a=b-c is not a correct arithmetic formula");
		if(a*b==c)
			System.out.println("a*b=c is a correct arithmetic formula");
		else 
			System.out.println("a*b=c is not a correct arithmetic formula");
	}

}
