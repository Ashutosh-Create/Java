import java.util.*;
public class prog_10
{
public static int fibonnaci(int n)
{
	if (n==1)
		return 0;
	else if (n==2)
		return 1;
	else 
		return (fibonnaci(n-1)+fibonnaci(n-2));
}
	public static void main(String[] args) 
	{
		int r=0;
		Scanner s =new Scanner (System.in);
		int n;
		System.out.println("enter the positon whose fibbonaci number is to be found out ");
		n =s .nextInt();
		for (int i =1;i<=n;i++)
		{
			r =fibonnaci(i);
		}
        System.out.println(r);
	}

}
