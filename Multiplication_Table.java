import java.util.Scanner;
public class Multiplication_Table {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number for which you want the multiplication");
       int n=sc.nextInt();
       System.out.println("Enter upto how many counts you want the multiplication");
       int m=sc.nextInt();
       System.out.println("Multiplication Table of n is :");
       while(i<=m)
       {
          System.out.println(n+" * "+i+" = "+n*i);
          i++;
       }
   }   
}
