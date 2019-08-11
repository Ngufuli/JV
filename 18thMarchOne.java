import java.lang.*;
import java.util.*;

interface Vehicle{
   static void read(){
       System.out.println("This is a vehicle");
   }
    static void speed(){
        System.out.println("This is the average speed");
    }
}

class Car implements Vehicle{
    void read(){

    }
}

class outPut{
    public static void main(String[] args){
        Car c = new Car();
        c.read();
        Vehicle.read();
    }
}
