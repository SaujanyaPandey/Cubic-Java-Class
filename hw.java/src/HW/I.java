package HW;

import java.util.Scanner;

public class I {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of pound: ");
       double pound = sc.nextDouble();

       double kilogram = 0.454 * pound;

       System.out.println("The weight in kilogram is: " + kilogram);




    }


}
