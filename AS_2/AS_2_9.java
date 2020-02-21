interface A{
void display ( ) ;
void count ( );
}
class B implements A{
static int maxcount;
String name;
B( String n){
	name=n;

}
	public void display() {
		System.out.println("Name: "+name);
		
	}

	public void count() {
		maxcount=name.length();
		System.out.println("No. of characters present in the name: "+maxcount);
		
	}
	
}
public class AS_2_9 {
	public static void main (String args[]){
		
		B a=new B("Manshi");
	a.display();
	a.count();
	}
}
