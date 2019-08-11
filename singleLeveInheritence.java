import java.util.*;
import java.lang.*;

class Cars{
int speed, wheels, horse_power;
String name;
Scanner input = new Scanner(System.in);

void get(){
  System.out.println("Please enter the Speed of the Car");
  speed = input.nextInt();
  System.out.println("Please enter the Number of wheels");
  wheels = input.nextInt();
  System.out.println("Enter the horse power of the car");
  horse_power = input.nextInt();
  System.out.println("Enter the name of the car");
  name = input.nextLine();
  name = input.nextLine();
}

void display(){
  System.out.println();
  System.out.println();
  System.out.println();
  System.out.println();
}

class Lamborghini extends Cars{

}

class Masserati extends Lamborghini{

}

class Audi extends Masserati{

}


}

class Carss{
  public static void main(String[] args){
    Lamborghini l = new Lamborghini();
    l.get();
    l.display();
  }
}
