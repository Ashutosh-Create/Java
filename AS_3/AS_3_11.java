import java.util.Scanner;


public class AS_3_11 {

	public static int gcd(int m,int n){
		if(n==0)
		return m;
		else{
			return gcd(n,m%n);
		}

	}
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two nos.");
		int n=sc.nextInt();
		int m=sc.nextInt();
		if (m>n){
			int a=n;
			n=m;
			m=a;
		}
		System.out.println("gcd:"+gcd(n,m));
	}
}
