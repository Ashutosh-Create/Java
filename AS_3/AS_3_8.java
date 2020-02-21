
public class AS_3_8 {
public static void binarysearch(int a[],int low,int high, int elem)
{
if(low>high)	
{
	System.out.println("not Present");
}
else
{
int 	mid=(low+high)/2;
	if(a[mid]==elem)
	{ 
		System.out.println("present");
	}
	else if(elem>a[mid])
	{ 
		binarysearch(a,mid+1,elem,high);
	}
	else if  (elem<a[mid])
	{
		binarysearch(a,low,elem,mid-1);
	}
}

}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9};
	binarysearch(a,0,a.length-1,11);
	//	System.out.print(p);
	}

}
