import java.util.*;
public class PROG_8 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		int a[],b[];
       int n;
       System.out.println("enter how many elements in array ");
       n=s.nextInt();
       a= new int [n];
       b=new int [n];
       System.out.println("enter "+n+" numbers in the first array");
       for(int i=0;i<n;i++)
       {
       	a[i]=s.nextInt();
       }
       System.out.println("enter "+n+" numbers in the second array");
       for(int i=0;i<n;i++)
       {
       b[i]=s.nextInt();
       }
       dotproduct(a,b,n);
	}
     public static void dotproduct(int a[],int b[],int n)
     {
    	 int c[]= new int [n];
    	 for(int i=0;i<n;i++)
    		 c[i]=a[i]*b[i];
    	System.out.println("the dot product is :");
    	 for(int i=0;i<n;i++)
    		 System.out.print(c[i]+" ");
     }
}
