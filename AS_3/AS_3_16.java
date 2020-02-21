import java.util.Scanner;


public class AS_3_16 {

	public static String pallin(String s){
		if(s==null||s.length()<=0)
		return s;
		else
			return (pallin(s.substring(1))+s.charAt(0));

	}
	public static void main(String[] args) {
String s="racecar";
String rev=pallin(s);
if(s.equals(rev))
	System.out.println(rev+" is Pallindrome");
else
	System.out.println(rev+" not Pallindrome");
	}
}
