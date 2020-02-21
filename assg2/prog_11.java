interface EMPinterface
{
	void displayemp();
	void giveBonus( double amt);
}
abstract class Employee implements EMPinterface
{
	String name,id;
	double salary;
	abstract public void displayemp();
	abstract public void giveBonus(double amt);
}
class Manager extends Employee
{
	public Manager(String n, String i, double s)
	{
		name=n;
		id=i;
		salary=s;
	}
	public void displayemp()
	{
		System.out.println("Name="+name);
		System.out.println("Id="+id);
		System.out.println("Salary="+salary);
		
	}
	public void giveBonus(double amt) throws 
	ArithmeticException
	{
		try
		{
			if(amt<=0)
				throw new ArithmeticException(" not valid amount");
			else
				System.out.println("Give Bonus");
		}
		catch(ArithmeticException A)
		{
                  salary =salary+bonus;
			System.out.println("validation over"+A);
		}
	}
	
}
public class prog_11 {

	public static void main(String[] args) 
	{
		EMPinterface E[]=new EMPinterface[3];
		E[0]= new Manager("Satyajit","E1",40000);
		E[1]= new Manager("JAjju","E2",45000);
		E[2]= new Manager("Rajju","E3",50000);
		E[0].giveBonus(-3000);
		E[1].giveBonus(6000);
		E[2].giveBonus(5000);
		E[0].displayemp();
		E[1].displayemp();
		E[2].displayemp();
	}
}

