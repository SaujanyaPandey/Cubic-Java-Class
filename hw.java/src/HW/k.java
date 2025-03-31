package HW;

import java.util.Scanner;

public class k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance: ");
        double s = sc.nextDouble();

        System.out.println("Enter the side of triangle: ");
        double a= sc.nextDouble();

        System.out.println("Enter the side of triangle: ");
        double b = sc.nextDouble();

        System.out.println("Enter the side of triangle: ");
        double c = sc.nextDouble();

        double area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("The area of the triangle is: " + area);



    }
}
