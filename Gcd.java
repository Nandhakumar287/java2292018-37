import java.io.*;
import java.util.*;
  public class Gcd{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Integer:");
      int a=sc.nextInt();
	  System.out.println("Enter b Integer:");
      int b=sc.nextInt();
      while(a != b)
        {
            if(a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println("G.C.D = " + a);
     }
   }  
  
