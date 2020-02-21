
public class AS_3_6 {
	public static <T> int count(T[] array,T item){
	int c=0;
		for(T i: array){
			if(i.equals(item)){
				c++;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
	Integer [] a={1,2,3,4,2};
	Double [] b={1.1,2.2,3.3,7.7};
	System.out.println("Occurance of 2= "+count(a,2)+" times.");
	System.out.println("Occurance of 7.7= "+count(b,7.7)+" times.");
	}

}
