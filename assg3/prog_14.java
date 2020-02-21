package recursion;


import java.util.Scanner;


public class prog_14
{

	public static int prod(int n,int m){
		if(m==0)
		return 0;
		else
			return (n+prod(n,m-1));

	}
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two nos.");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Product:"+prod(n,m));
	}
}


