import java.lang.*;
import java.util.*;

class  citizen{
    static int age = 10;
    String name  ="John";
    

    static class Passport{
        static final int numOfEntries = 50;
        
        static String nameOfCoutnry = "India";
    
    void display(){
        citizen obj = new citizen();
            System.out.println(obj.age);
            System.out.println(obj.name);
            System.out.println(numOfEntries);
            System.out.println(nameOfCoutnry);
            // System.out.println();
        }  
    }

}

 class classInsideClass{
    public static void main(String[] args){
        
        citizen.Passport obj = new citizen();
       Passport objj = new Passport();
        objj.display();
    }
}