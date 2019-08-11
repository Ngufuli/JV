import java.lang.*;
import java.util.*;

class Gen<T>{
    T ob; //declaration of T object 
    

    //Constructor
    Gen(T o){
    ob = o;
    }

    //function to return the object
    T getOb(){
        return ob;
    }

    //function to display the data type
    void showType(){
        System.out.println("The data type of T is :" + ob.getClass().getName());
    }
}

class GenDemo{
    public static void main(String[] args){
        Gen<Integer> obj;
        obj = new Gen<Integer>(100);

        obj.showType();

        int v = obj.getOb();
        System.out.println("The value of V is :" + v);

        Gen<String> strObj = new Gen<String>("This is the String");
        strObj.showType();

        String str = strObj.getOb();
        System.out.println("The value of the String is: " + str);
    }
}