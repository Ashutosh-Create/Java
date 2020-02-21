import java.util.*;
public class PROG_5
 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner s= new Scanner (System.in);
		System.out.println("enter the integer ");
		a = s.nextInt();
		boolean b = false;
		b= isOdd(a);
		if(b==true)
			System.out.println(a+"is odd");
		else
			System.out.println(a+"is even");
    }
	  public static boolean isOdd (int i)
	  {    boolean q=false;
		  while (i>=1)
		  {
			  i=i-2;
			  if(i==1)
			  {
				  q=true;
	     		  break;
			  
	  }
		  }
			  return q;
	  

}
}