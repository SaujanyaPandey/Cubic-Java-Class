package HW;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a radius of circle: ");
        double radius = sc.nextDouble();

        double PerimeterOfCircle= (double )(Math.PI* 2 * radius);
        System.out.println("Perimeter Of Circle: " + PerimeterOfCircle);

        System.out.println("Enter a length of rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter a width of rectangle: ");
        double width = sc.nextDouble();

        double PerimeterOfRectangle =2*(length*width);
        System.out.println("Perimeter of Rectangle: " + PerimeterOfRectangle);

        System.out.println("Enter 3 side of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double PerimeterOfTriangle = (a+b+c);
        System.out.println("Perimeter of Triangle: " + PerimeterOfTriangle);




    }
}
