import java.util.Scanner;
import java.lang.*;

public class bis{

    public static void main(String[] args) {
    int a;
      Scanner in = new Scanner(System.in);
    System.out.println("Dame el año");
     a=in.nextInt();
     if(a%4==0&&a%100!=0||a%400==0)
     {


    System.out.printf("bisiesto");
     }
else{  System.out.printf("no bisiesto");}
} //cierre de main

} // cierre de la clase
 	
