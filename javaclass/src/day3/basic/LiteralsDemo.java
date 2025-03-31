package day3.basic;

public class LiteralsDemo {
    public static void main(String[] args) {

        //Literals: a source code representation of fixed value
        //literals== value+data type

        //1.Integer Literal 435 567687 8989789 34345(int)
        byte b= 127;
        short s= 32767;
        int i= 2147483647;
        long l1= 2147483647;
        long l2= 2147483648L;
        long l3= 9223372036854775807L;


        //2.Floating Literal 35.67 23.45(double)

        float f = 23.45F;
        double d = 23.45;
        double d2=35.67D;


        //3.Boolean Literals true false
        boolean bb1= true;
        boolean bb2 = false;

        //4. Character Literals '1' 'q' '@'
        char c1 ='a';
        char c2 ='2';
        char c3 = '#';

        //5.String Literals "a" "fgdf" "123"

        String s1="a";
        String s2 = "Hello";
        String s3 = "abc@123#$dd";
        String s4="123";
        String s5 ="45.63";
        String s6 = "true";
        String s7 = "Hello This is Java class from cubic.This class will run for 2 month.";
        String s8 = "";
        String s9 = " ";

        //6.null literals

        String s10 = null;

        //this is object in java
        LiteralsDemo obj = new LiteralsDemo();
        LiteralsDemo ob = null;



    }
}
