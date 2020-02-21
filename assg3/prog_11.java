package recursion;
import java .util.*;
public class prog_11 
{
     public static int gcd(int x,int y)
     {
    	 int g;
    	 if (y==0)
    		 g=x;
    	 else 
    		 g = gcd(y,x%y);
    	 return g;
     }
	public static void main(String[] args)
	{ 
		int x, y;
		Scanner s = new Scanner (System.in);
		System.out.println("enter two numbers  ");
        x= s.nextInt();
        y =s.nextInt();
        int a = gcd (x,y);
        System.out.println("gcd = "+a);
	}

}
