import java.util.*;
public class prog_1 
{
    public static void main(String args[])
    {
    	Scanner s =new Scanner (System.in);
    	System.out.println("enter your lucky number :");
    	int l = s.nextInt();
    	try
    	{
    		if(l<0)
    		{
    			throw new NumberFormatException("that's not positive number ");
    	}
    }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
}
}
