import java.util.Scanner;


public class AS_3_9 {

	public static int fibo(int n){
		if(n==0)
		return 0;
		else if(n==1)
		return 1;
		else{
			return fibo(n-1)+fibo(n-2);
		}

	}
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		int r=fibo(n);
		System.out.println("fibo:"+r);
	}
}
