import java.util.*;
import java.lang.*;

//this program is compile time checking strong hence in main function we do not implement obj = obj1;
class LogicGen<anything>{
    anything ob;
    anything get(anything ob){
        this.ob = ob;
        return ob;
    }

    void belonging(){
        System.out.println("" + ob.getClass().getName());
    }
}

class GenericClass{
    public static void main(String[] args){
        LogicGen<integer> obj = new LogicGen<integer>();
        //generic object and here we mention actual type of objects being passed
        int a  = obj.get(44);
        System.out.println("" + a);
        obj.belonging();


        LogicGen<String> obj1 = new LogicGen<String>();
        String s = obj1.get("Hello world of generics");
        System.out.println("" + s);
        obj1.belonging();
    }
}