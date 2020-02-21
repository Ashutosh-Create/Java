import java.util.Scanner;
public class prog_17 {
	public static void part(int a[], int k, int low, int high )
	{
		if(low<high){
			if(a[low]<k)
				low++;
			else
				if(a[high]>k)
					high--;
			else if(a[high]==a[low])
					low++;
				else
				{
					int temp=a[low];
					a[low]=a[high];
					a[high]=temp;
				}
			part(a,k,low,high);
		}
		}
	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
	int a[]={6,4,5,9,1,8,7,4};
	System.out.println("Enter the partitioning value");
	int k=sc.nextInt();
	part(a,k, 0, a.length-1);
	for(int i:a)
	{
		System.out.print(i+" ");
	}
		}

}
