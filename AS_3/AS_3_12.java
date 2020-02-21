import java.util.Scanner;


public class AS_3_12 {
static int mid;
	public static int binarysearch(int a[],int e,int low,int high){
		mid=(low+high)/2;
		if(low<high)
		{
			if(e==a[mid]) return 1;
			else if(e>a[mid])
				return binarysearch(a,e,low+1,high);
			else
				return binarysearch(a,e,low,high-1);
			
		}
		else
			return 0;
	}
	public static void main(String[] args) {
int a[]={1,2,3,7,8,9,11};
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the element to be searched.");
		int e=sc.nextInt();
		int b=binarysearch(a,e,0,a.length);
		if (b!=0)System.out.println("Element found at:"+(mid+1));
		else	
		System.out.println("Element not found.");
	}
}
