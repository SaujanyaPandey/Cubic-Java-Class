package day3.basic;

public class OperatorDemo5 {

    public static void main(String[] args) {

        //5. Logical Operator: &&(and) ||(or) !(not)


        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false);//false

       System.out.println("==========");
        int a = 4;
        int b = 15;
        int c = 6;
        System.out.println(a < b && b > c); //true
        System.out.println(a < b && b < c); //false
        System.out.println(a > b && b > c); //false
        System.out.println(a < b && b < c);//false




    }

}
