import java.util.*;
import java.lang.*;

class LogicNonGen{
    Object ob;
    Object display(Object ob){
        this.ob = ob;
        return ob;
    }

    void belonging(){
        System.out.println(ob.getClass().getName());
    }
}

class genericsOne{
    public static void main(String arg[]){
        LogicNonGen obj = new LogicNonGen();
        int a = (Integer)obj.display(44);
        System.out.println("" + a);
        obj.belonging();

        LogicNonGen obj1 = new LogicNonGen();
        String s = (String)obj1.display("Hello world");
        System.out.println("" + s);
        obj1.belonging();

        obj = obj1;
    }
}