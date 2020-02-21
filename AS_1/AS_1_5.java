import java.util.Scanner;


public class AS_1_5{

public static boolean isOdd(int i){

	while(i!=0&&i>0){
		i=i-2;
	
	}
	if(i==0){

		return false;
	}

else{

	return true;
}
}

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no.");
	int i=sc.nextInt();
boolean r=isOdd(i);
System.out.println(r);}

}
