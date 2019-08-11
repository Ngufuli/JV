import java.lang.*;
import java.util.*;

class  citizen{
    static int age = 10;
    static String name  ="John";


    static class Passport{

        static final int numOfEntries = 50;

        static String nameOfCoutnry = "India";

    void display(){

            System.out.println(citizen.age);
            System.out.println(citizen.name);
            System.out.println(numOfEntries);
            System.out.println(nameOfCoutnry);

        }
    }

}

 class mainClass{
    public static void main(String[] args){

        citizen.Passport obj = new citizen.Passport();
        obj.display();
    }
}