package recursion;
import java.util.*;



public class prog_12
{

	static int m;
	public static int binarysearch(int a[],int e,int l,int h){
		m=(l+h)/2;
		if(l<h)
		{
			if(e==a[m]) return 1;
			else if(e>a[m])
				return binarysearch(a,e,l+1,h);
			else
				return binarysearch(a,e,l,h-1);
			
		}
		else
			return 0;
	}
	public static void main(String[] args)
	{
            int a[]={1,2,3,7,8,9,11,98,956,495,47};
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the element to be searched.");
		int e=sc.nextInt();
		int b=binarysearch(a,e,0,a.length);
		if (b!=0)
			System.out.println("Element found at:"+(m+1));
		else	
		System.out.println("HATT BSDK........NUMBER NAHI MILA.......#PKMKB........#PKMKB........#PKMKB......");
		
	}
}