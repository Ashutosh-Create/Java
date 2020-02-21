class Flower{
	String name;
	int petal;
	float price;
	void setValue(String n,	int p,float pr){
		name=n;
		petal=p;
		price=pr;
		
	}
	void getvalue(){
		System.out.println("Flower Name:"+name+"No. petals:"+petal+" Price:"+price);

	}
}




public class AS_1_12 {

	public static void main(String[] args) {
Flower f=new Flower();
Flower f2=new Flower();

f.setValue("Tulip ",21,100);
f2.setValue("Rose ",30,10);
f.getvalue();
f2.getvalue();


	}

}
