import java.lang.*;
import java.util.*;

class A{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{


            try{
                int a;
                int b;
                int c;
                System.out.println("Enter the number: ");
                a = input.nextInt();

                System.out.println("Enter the number: ");
                b = input.nextInt();

                c = a/b;
                System.out.println(c);
            }
            // catch(ArithmeticException a){// if this is not compatible, the controll is transfered to outer body exception handler!!!!!!!!!!!
            //     System.out.println(a);
            //     System.out.println("Enter correct numerals");
            }
            finally{
                int a, b, c = 10;
                // System.out.println("Enter the first number");
                // a = input.nextInt();

                // System.out.println("Enter the second number");
                // b = input.nextInt();

                System.out.println(c);
            }
        }
        // catch(ArithmeticException a){
        //     System.out.println(a);
        //     System.out.println("Enter the correct numerals");
        // }
    }
}