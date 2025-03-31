package HW;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the initial velocity: ");
        double u = sc.nextDouble();

        System.out.println("Enter the time: ");
        double t = sc.nextDouble();

        System.out.println("Enter the acceleration: ");
        double a = sc.nextDouble();

         double distance = u*t + 0.5* a*t*t ;
         System.out.println("The distance is: " + distance);

    }
}
