import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner keyboard = new Scanner(System.in);
        double num = keyboard.nextDouble();

        if (num <= Byte.MAX_VALUE){
            System.out.println("Byte");
        }else if(num <= Short.MAX_VALUE){
            System.out.println("Short");
        }else if(num <= Integer.MAX_VALUE) {
            System.out.println("Int");
        }else if(num <= Long.MAX_VALUE) {
            System.out.println("Long");
        }else if(num <= Float.MAX_VALUE) {
            System.out.println("Float");
        }else if(num <= Double.MAX_VALUE) {
            System.out.println("Double");
        }





    }
}
