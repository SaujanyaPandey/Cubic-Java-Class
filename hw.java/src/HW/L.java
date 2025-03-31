package HW;

import java.util.Scanner;

public class L {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the a of equation: ");
     double a = sc.nextDouble();

     System.out.println("Enter the b of equation: ");
     double b = sc.nextDouble();

     System.out.println("Enter the c of equation: ");
     double c = sc.nextDouble();

     double x = (-b + Math.sqrt (b*b - 4*a*c))/(2*a);

     System.out.println("The equation is: " + x);



 }




}
