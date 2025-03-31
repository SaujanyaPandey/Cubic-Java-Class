package day4.basic;

public class TypeCastingDemo2 {
    public static void main(String[] args) {

        char c1 = 97;
        short s1 = 97;
        System.out.println(c1);
        System.out.println(s1);

        char c2 = 'a';
        short s2 = 'a';
        System.out.println(c2);
        System.out.println(s2);

        char c3 = 'A';
        short s3 = (short) c3;
        System.out.println(c3);
        System.out.println(s3);

        short s4 = 66;
        char c4 = (char) s4;
        System.out.println(c4);
        System.out.println(s4);
    }
}
