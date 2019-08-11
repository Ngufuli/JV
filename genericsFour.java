import java.util.*;
import java.lang.*;

//this program with generics as a two type parameter
class LogicGen<anything, something> {
    anything ob1;
    something ob2;

    anything get(anything ob1, something ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        return ob;
    }

    void belonging() {
        System.out.println("" + ob1.getClass().getName());
        System.out.println("" + ob2.getClass().getName());
    }
}

class GenericClass {
    public static void main(String[] args) {
        LogicGen<Integer> obj = new LogicGen<Integer>();
        // generic object and here we mention actual type of objects being passed
        int a = obj.get(44);
        System.out.println("" + a);
        obj.belonging();

        LogicGen<String> obj1 = new LogicGen<String>();
        String s = obj1.get("Hello world of generics");
        System.out.println("" + s);
        obj1.belonging();
    }
}