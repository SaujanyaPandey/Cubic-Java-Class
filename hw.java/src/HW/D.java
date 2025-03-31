package HW;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter an Principal: ");
       double principal = input.nextDouble();

        System.out.println("Enter an time: ");
        double time = input.nextDouble();

        System.out.println("Enter an RateOfInterest: ");
        double rate = input.nextDouble();

       double SimpleInterest =  (principal * time * rate)/100;

       System.out.println("Simple Interest :" + SimpleInterest);
          }
}
