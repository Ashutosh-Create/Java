
public class Demo {
void validation(int s){
	if (s>0){
		Commission c= new Commission(s);
		c.getCommission();
	}
	else{
		System.out.println("invalid Input");
			
	}
}
}
