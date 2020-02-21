import java.util.*;
public class PROG_6 
{

	public static void main(String[] args) 
	{
		int a[] ;
		Scanner s = new Scanner (System.in);
		System.out.println("enter how many numbers ");
		int n =s.nextInt();
		a=new int [n];
		System.out.println("enter "+n+" numbers ");
		for (int i=0;i<n;i++)
			a[i]=s.nextInt();
		largesmall(a);

	}
     public static void largesmall(int a[])
     {
    	 int l,s;
    	 l=s=a[0];
    	 for (int i=1;i<a.length;i++)
    	 {
    		 if(l<a[i])
    			 l=a[i];
    		 if(s>a[i])
    			 s=a[i];
    	 }
    	 System.out.println("LARGEST NUMBER ="+l+"\n"+"smallest number ="+s);
     }
}
