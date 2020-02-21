import java.util.Scanner;


public class AS_1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,c=0,l,m,n;
char [] str={'c','a','r','b','o','n'};
for(i=0;i<str.length;i++){
	for(j=0;j<str.length;j++){
		for(k=0;k<str.length;k++){
			for(l=0;l<str.length;l++){
				for(m=0;m<str.length;m++){
					for(n=0;n<str.length;n++){
		
if((i!=j)&&(i!=k)&&(i!=l)&&(i!=m)&&(i!=n)&&(j!=k)&&(j!=l)&&(j!=m)&&(j!=n)&&(k!=l)&&(k!=m)&&(k!=n)&&(l!=m)&&(l!=n)&&(m!=n))
{		
	System.out.println(str[i]+""+str[j]+""+str[k]+""+str[l]+""+str[m]+""+str[n]);
	c++;
}
	}
					}
				}
			}
		}
	}
System.out.println(c);
}
}