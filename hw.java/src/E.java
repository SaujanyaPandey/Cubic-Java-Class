import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius of circle: ");
        double radius = sc.nextDouble();



        double areaOfCircle= (double )(Math.PI * radius * radius);
System.out.println("Area Of Circle: " + areaOfCircle);

        System.out.println("Enter a length of rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter a width of rectangle: ");
        double width = sc.nextDouble();

        double areaOfRectangle =length*width;
System.out.println("Area of Rectangle: " + areaOfRectangle);

        System.out.println("Enter a base of triangle: ");
        double base = sc.nextDouble();

        System.out.println("Enter a height of triangle: ");
        double height = sc.nextDouble();

        double areaOfTriangle = (0.5 *base*height);
 System.out.println("Area of Triangle: " + areaOfTriangle);




    }
}
