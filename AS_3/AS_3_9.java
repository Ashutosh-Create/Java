import java.util.Scanner;


public class AS_3_9 {
static int rev=0;
	public static int reverse(int n){
		if(n>0){
			int r =n%10;
			rev =(rev*10)+r;
			reverse(n/10);
		}
	return rev;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		int r=reverse(n);
		System.out.println("Reverse:"+r);
	}
}
