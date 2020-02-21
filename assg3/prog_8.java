import java.util.*;
public class prog_8 
{

	public static int power (int x ,int n)
	{
		if (n==0)
			return 1;
		else  
			return(x*power(x,n-1));
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("enter the base and the power to be raised ");
		int x =s.nextInt();
		int n =s.nextInt();
		int p =power (x,n);
		System.out.println(x+"^"+n+"="+p);

	}

}
