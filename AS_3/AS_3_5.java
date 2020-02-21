
public class AS_3_5 {
	public static <E> void printArray(E[] inputArray){
	
		
	
		for(int i=0; i<inputArray.length;i++){
			System.out.println(inputArray[i]);
		}
	}
	
	public static void main(String[] args) {
	Integer [] iArray={1,2,3,4};
	Double [] dArray={1.1,2.2,3.3,4.4};
	printArray(iArray);
	printArray(dArray);
	}

}
