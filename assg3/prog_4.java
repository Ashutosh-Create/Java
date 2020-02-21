

 class Box<T>{
	 T t;
Box(T t){
	this.t=t;
}

 void update(T s){
	t=s;


	}
T get(){

		return t;
 }
 }
	
	public class prog_4{
	public static void main(String args[]){
		Box <String> stringBox=new  Box<String> ("Hello");		
	    Box <Integer> integerBox=new Box<Integer> (10);	
stringBox.update("hi");
integerBox.update(11);		
Box<Integer> b3= integerBox;
Box<Object> b4=new Box<Object>(2);
System.out.println(integerBox.get());
System.out.println(stringBox.get());
System.out.println(b3.get());
System.out.println(b4.get());

	}
}
