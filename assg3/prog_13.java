package recursion;
import java .util.*;
public class prog_13
{
   public static void binaryeq(int n)
   {
	   if(n>0)
	   {
	   binaryeq(n/2);
	   System.out.print(n%2);
	   }
   }
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("enter a number ");
		int n =s.nextInt();
		binaryeq(n);

	}

}
