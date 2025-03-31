package day3.basic;

public class OperatorDemo7 {

    public static void main(String[] args) {
        //Ternary Operators

        int a = 4;
        int b =6;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
        String r = (a > b) ? "a is greater than b." : "b is greater than a";
        System.out.println(r);

        Boolean rr = (a > b) ? true : false;
        System.out.println(rr);
    }
}
