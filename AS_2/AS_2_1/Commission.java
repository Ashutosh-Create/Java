import java.util.Scanner;


public class Commission {
	int sales;
	Commission(int s){
		sales=s;
	}
void	getCommission(){
if(sales<500){
	System.out.println("2% of SALES ");
}
else if(sales<5000){
		System.out.println("5% of SALES ");
	
}else if(sales>=5000){
	System.out.println("8% of SALES ");
	
}
}
}
