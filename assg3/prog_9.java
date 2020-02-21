import java.util.*;
public class prog_9
{
	static int rev;
	public static int reverse(int n)
	{
	if(n>0){
		int r =n%10;
		 rev =(rev*10)+r;
		reverse(n/10);
	}
return rev;
}
public static void main(String[] args)
{

	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a no.");
	int n=sc.nextInt();
	int r=reverse(n);
	System.out.println("Reverse:"+r);
}

}
