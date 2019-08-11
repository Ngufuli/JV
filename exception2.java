import java.lang.*;
import java.util.*;

class A{
    public static void main(String[] args){
        try{
            int a, b, c;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            a = input.nextInt();
            System.out.println("Enter the second number:");
            b = input.nextInt();
            c = a/b;
        }
        finally{
            System.out.println(c);
        }
    }
}