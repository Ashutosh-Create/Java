import java.util.*;
public class AS_3_18 {

   public static void tower(int n, String A, String B, String C) {
       if (n == 1) 
       {
           System.out.println("Move "+A + " -> " + B);
       } 
       else 
       {
           tower(n - 1, A, C, B);
           System.out.println("Move "+A + " -> " + B);
           tower(n - 1, C, B, A);
       }
   }

   public static void main(String[] args) {
       System.out.print("Enter number of discs: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       tower(n, "A", "B", "C");
   }
}

