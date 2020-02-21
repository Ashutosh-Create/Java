import java.util.Scanner;


public class AS_1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a ,b=0 ;
		System.out.println("Enter a no.");
		a=sc.nextInt();
		while(a>2){
			a=a/2;
			if(a%2==0){b++;}
		}System.out.println("no. of times="+b);
	}

}
