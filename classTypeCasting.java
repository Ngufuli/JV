import java.util.*;
import java.lang.*;

class Vehicle{


  class Car extends Vehicle{

    void read(Vehicle V){
      if(V instanceof Vehicle){
        V.read();
        Car C1 = (Car) V;
        C1.display();
      }
    }

    void display(){uy
      System.out.println("Hey in display of child class");
    }
  }

}

class W{
  public static void main(String[] args){
    Car C = new Car();
    C.read(C)
  }
}
