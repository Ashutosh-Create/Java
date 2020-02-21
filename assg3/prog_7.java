import java.util.*;

public class prog_7
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number whose factorial is to be found ");
		int n =s.nextInt();
		int r = fact (n);
		System.out.println("factorial ="+ r);

	}

	private static int fact(int n)
	{
		if (n==0)
			return 1;
		else 
			return(n*fact(n-1));
	}
}
