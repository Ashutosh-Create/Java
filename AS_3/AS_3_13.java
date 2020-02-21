import java.util.Scanner;


public class AS_3_13 {

	public static void decimaltobinary(int n){
		if(n>0){
			decimaltobinary(n/2);
			System.out.print(n%2);
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		decimaltobinary(n);
	}
}
