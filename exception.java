import java.util.*;
import java.lang.*;
import java.lang.ArithmeticException;

class A{
    public static void main(String[] args){
        try{
            int a;
            int b;
            int c;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextInt();

            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a){
            System.out.println(a);
            System.out.println("Don't run");
        }
    }
}