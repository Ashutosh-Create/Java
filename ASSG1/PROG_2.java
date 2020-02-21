import java.util.*;
public class PROG_2 
{

	public static void main(String[] args) 
	{
		int c=0, a,n ;
		Scanner s = new Scanner (System.in);
		System.out.println(" enter an  integer greater than 2 ");
		a = s.nextInt();
		n=a;
       while (a>2)
       {
    	   a= a/2;
    	   c++;
       }
       System.out.println(n+ "is divided by 2 :"+ c +" times ");
	}

}
