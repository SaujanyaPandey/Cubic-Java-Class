package HW;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Enter the temperature im Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    double Tempcelsius = (fahrenheit - 32) * 5 / 9;

    System.out.println("Celsius: " + Tempcelsius);

    System.out.println("Enter the temperature in Celsius: ");
    double celsius = scanner.nextDouble();
    double fahrenheitTemp = (celsius * 9 / 5) + 32;

    System.out.println("Fahrenheit: " + fahrenheitTemp );
    }
}

