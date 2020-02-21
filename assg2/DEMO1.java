import java.util.*;
 class Commission
 {
	  double sales;
	 Commission(double sales)
	 {
		 this.sales =sales;
		 
	 }
	 public  double getCommission()
	 {    double c = 2;
		 if (sales<500)
			 c=0.02*sales;
		 else if (sales<5000)
			 c=0.05*sales;
		 else if (sales>=5000)
			 c=0.08*sales;
		return c;		
	 }
	   
 }
 
public class DEMO 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the sales ");
		double sal = s.nextDouble();
		if(sal>0.0)
		{
			Commission ob =new Commission(sal);
			double amt = ob.getCommission();	
			
			System.out.println("Commission  = "+amt );
		}
		else 
			System.out.println("INVALID INPUT " );
	}

	

}
