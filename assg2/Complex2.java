import java.util.*;
class Complex
{
    float real,imag;
    
    void setData(float r,float i)
    {
    	real =r;
    	imag =i;
    }
    void Display()
    {
    	if (imag>=0)
    	System.out.println(real+ "+"+imag+"i");
    	else 
    		System.out.println(real+" "+ imag+"i");	
    }
    public  static Complex add(Complex c1,Complex c2)
    {
    	Complex t =new Complex ();
    	t.real =c1.real+c2.real;
    	t.imag =c1.imag+c2.imag;
    	return t;
    }
	public static void main(String[] args)
	{
		Complex c1 =new Complex ();
		c1.setData(3.4f, 2.0f);
		Complex c2 =new Complex ();
		c2.setData(6.5f, -1.8f);
		Complex t =add(c1,c2);
		System.out.println(t.real+ "+"+t.imag+" i");
		

	}

}
