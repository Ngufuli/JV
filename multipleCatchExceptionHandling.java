import java.util.*;
import java.io.IOException;
import java.lang.*;
import java.lang.ArithmeticException;

class A{
    public static void main(String[] args){
        try{
            //arthmetic operation
            int a = 50/0;

            //array operation
            int e[] = new int[1];
            e[3] = 90;
            System.out.println(a);

            for(int i=0; i<e.length; i++){
                System.out.println(e[i]);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
        catch(ArithmeticException a){
            System.out.println(a);
            System.out.println("Don't run");
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);
            System.out.println("Array size should be accurate");
        }
    }
}