
 class Complex {
	int real;
	int imag;
	void setData(int r, int i){
		real=r;
		imag=i;
	}
	 Complex add(Complex c1, Complex c2){
		Complex c3= new Complex();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
	 return c3;
	 }	
	void display(){
		System.out.println(real+"+i"+imag);
	}}
public class Complex_Num{
	public static void main(String []args){
		Complex c= new Complex();
		Complex c1= new Complex();
		Complex c2= new Complex();
	c.setData(2, 3);
	c1.setData(3, 4);
	c2=c2.add(c, c1);
	c.display();
	c1.display();
	c2.display();
	
	
	}
}

