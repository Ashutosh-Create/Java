import java.util.Scanner;
public class prog_2
{

	public static void main(String[] args) 
	{
		String a[]={"red",null};
     try
     {
           int l=a[1].length();
            System.out.println(l);

	 }
           catch(NullPointerException e)
      {
	        System.out.println("Exception:"+e);
       }
	
          try
            {
	         a[2]="white";
	          System.out.println(a[2]);
	
            }
             catch(ArrayIndexOutOfBoundsException e)
          {
	       System.out.println("ArrayIndexOutOfBoundsException");
          }
       }

}

 