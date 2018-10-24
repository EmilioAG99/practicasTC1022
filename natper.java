import java.util.Scanner;
import java.lang.*;

public class natper{

    public static void main(String[] args) {
    int a,i,ac=0;
      Scanner in = new Scanner(System.in);
    System.out.println("Dame el numero");
     a=in.nextInt();
     for(i=1;i<a;i++)
     {
        if(a%i==0)
        	{ac=ac+i;}

     }
     if(ac==a)
     	{System.out.printf("Numero natural perfecto");}
     else {System.out.printf("Numero natural no perfecto");}

  
} //cierre de main

} // cierre de la clase
 	
