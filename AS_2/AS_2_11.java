import java.util.Scanner;
import java.lang.*;
interface EmpInterface{
	void displayEmp(); 
	void giveBonus(double amount);

}

abstract class Employee 
{
 	int empID; 
		String fName; 
		String lName; 
		int salary;
}
class Manager extends Employee implements EmpInterface{
	double bonus;
	Manager(){
		Scanner sc=new Scanner(System.in);  
	     System.out.println("Enter employee ID.");
	     empID=sc.nextInt();
	     System.out.println("Enter employee first name.");
	     fName=sc.next();
	     System.out.println("Enter employee last name.");
	     lName=sc.next();
	     System.out.println("Enter employee salary.");
	     salary=sc.nextInt();
	}
	public void giveBonus(double amount){
		try{
			if (amount<=0){
				throw new ArithmeticException("illeagal bonus."+amount);
			}
			else{
				bonus=amount;
				salary+=bonus;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public void displayEmp() {
	     System.out.println(empID+" "+fName+" "+lName+" "+salary);
	}
}
public class AS_2_11 {

	public static void main(String[] args) {
		EmpInterface em[]=new EmpInterface[3];
		for(int i=0;i<3;i++){
			em[i]=new Manager();
			Scanner sc=new Scanner(System.in);
		     System.out.println("Enter amount.");
			em[i].giveBonus(sc.nextInt());
		}
		for(int i=0;i<3;i++){
		
			em[i].displayEmp();
		}
	}

}
