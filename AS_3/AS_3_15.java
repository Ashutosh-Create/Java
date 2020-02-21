import java.util.Scanner;


public class AS_3_15 {

	public static void reverse(char a[],int low , int high){
		if(low<high){
			char temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			reverse(a,low+1,high-1);
		}	}

	public static void main(String[] args) {
char a[]={'p','o','t','s','&','p','a','n','s'};
System.out.println("Array:");
for(int i=0;i<a.length;i++){
	System.out.print(a[i]);
	}
reverse(a,0,a.length-1);

System.out.println("\nRevesed Array:");
for(int i=0;i<a.length;i++){
System.out.print(a[i]);
}
}
}
