import java.util.*;
public class creditcard 
{
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	creditcard(String c,String b,String a ,int l,double bal)
	{
		customer  = c;
		bank=b;
		account = a;
		limit =l;
		balance =bal;
	}
	creditcard(String c,String b,String a ,int l)
	{
		this(c,b,a,l,0.0);
	}
	void makepayment(double amount)
	{
		balance = balance - amount;
	}
     public String  getcustomer()
     {
    	 return customer;
     }
     public String getbank()
     {
    	 return bank;
     }
     public String  getaccount()
     {
    	 return account;
     }
     public int getlimit()
     {
    	 return limit;
     }
     public double getbalance()
 	{
 		return balance;
 	}
   public boolean charge(double price)
    {
	   if(balance+price<=limit)
			return false;
		balance+=price;
		return true;

    }
   
	public static void printSummary(creditcard card)
	{
		System.out.println("Customer="+ card.getcustomer());
		System.out.println("Bank="+ card.getbank());
		System.out.println("Account="+ card.getaccount());
		System.out.println("Limit="+ card.getlimit());
		System.out.println("Balance="+ card.getbalance());
	}

	public static void main(String[] args) {
		creditcard wallet[]= new creditcard[3];
		wallet[0]= new creditcard("A1","B1","123",5000);
		wallet[1]= new creditcard("A2","B2","456",3500);
		wallet[2]= new creditcard("A3","B3","789",2000,500);
		for(int v=1;v<+16;v++)
		{
			wallet[0].charge(3*v);
			wallet[1].charge(2*v);
		wallet[2].charge(1*v);
		}
		for(int i=0;i<3;i++)
		{
			creditcard.printSummary(wallet[i]);
			while(wallet[i].getbalance()>200.0);
			{
				wallet[i].makepayment(200);
				System.out.println("New Balance="+wallet[i].getbalance());
			}

}
}
}