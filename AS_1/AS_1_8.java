import java.util.Scanner;

class dotproduct{
	int dp(int x, int y){
		int d=x*y;
		return d;
	}

}
public class AS_1_8 {

	public static void main(String[] args) {
		dotproduct d=new dotproduct();
		Scanner sc=new Scanner(System.in);
int a[]= new int[1000];
int b[]= new int[1000];
int c[]= new int[1000];
int i,n;
System.out.println("Enter value of n.");
n=sc.nextInt();
System.out.println("Enter first array.");
for(i=0;i<n;i++){
	a[i]=sc.nextInt();
			}

System.out.println("Enter second array.");
for(i=0;i<n;i++){
	b[i]=sc.nextInt();
			}
for(i=0;i<n;i++){
	c[i]=d.dp(a[i],b[i]);
			}for(i=0;i<n;i++){
				System.out.println(c[i]);
							}
}

}
