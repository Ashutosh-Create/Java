import java.util.*;
public class PROG_7 
{

	public static void main(String[] args) 
	{
		int a[],n;
		Scanner s =new Scanner (System.in);
		 System.out.println("enter how many elements in array ");
	       n=s.nextInt();
	       a= new int [n];
	       System.out.println("enter "+n+" numbers in the first array");
	       for(int i=0;i<n;i++)
	       {
	       	a[i]=s.nextInt();
	       }
	       distinctproductodd(a,n); 
	}
      public static void distinctproductodd(int a[],int n)
      {
    	  
    	  int temp[]=new int [n];
    	  for(int i=0;i<n;i++)
          {
          	 for(int j=0;j<n-i-1;j++)
          	 {
          		 if(a[j]>a[j+1])
          		 {
          			 int t;
          			 t=a[j];
          			 a[j]=a[j+1];
          			 a[j+1]=t;
          		 }
          	 }
          }    
          int c=0,r=0;
             
             for(int k=0;k<n-1;k++)
             {
          	   if (a[k]!=a[k+1])
          		   temp[c++]=a[k];
             }
                temp[c++]=a[n-1];
                for(int i =0;i<c;i++)
                {
              	  if(temp[i]%2!=0)
              	    r++;
                }
            if (r>=2)
            	System.out.println(" there is a pair of distinct elements of the array whose product is odd");
            else
            	System.out.println(" there is no pair of distinct elements of the array whose product is odd");
      }
}