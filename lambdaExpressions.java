import java.util.*;
import java.lang.*;

@FunctionalInterface
interface Summation{
    int sum(int a, int b);
}

@FunctionalInterface
interface Summation1{
    int sum();
}

@FunctionalInterface
interface Summation2{
    void sum(int a, int b);
}

@FunctionalInterface
interface Summation3{
    void sum();
}


public class lambdaExpressions{
  public static void main(String a[]){

        Summation obj = (x,y)->{
            return x+y;
        };
        Summation1 obj1 = ()->{
            int aa=10;
            int bb=20;
            return aa+bb;
        };
        Summation2 obj2 = (x,y)->{
            int aaa=x;
            int bbb=y;
           int ccc = aaa+bbb;
            System.out.println(ccc);
        };
        Summation3 obj3 =()->{
            int p;
            int q;
            p = q = 20;
            int r = p + q;
            System.out.println(r);
        };

        System.out.println(obj.sum(10,20));
        System.out.println(obj1.sum());
        obj2.sum(3,5);
        obj3.sum();

    }
}