import java.util.*;
import java.lang.*;

class A{
    
    void read(){
        try{
            throw new ArithmeticException("Object thrown in try block");
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
class B{
    public static void main(String[] args){
        A a =  new A();
        a.read();
    }
}