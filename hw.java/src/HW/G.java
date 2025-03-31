package HW;

import java.util.Scanner;

import static java.lang.Math.PI;

public class G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder: ");
        double radius = sc.nextDouble();


System.out.println("Enter the length of cylinder: ");
    double length = sc.nextDouble();

    double volumeOfCylinder = (Math.PI * radius * radius * length);
    System.out.println("Volume of Cylinder: " + volumeOfCylinder);
    }
}
