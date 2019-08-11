import java.util.*;
import java.lang.*;

class Box{
  double length;
  double width;
  double breadth;
}

class theBox{
  public static void main(String[] arg){
    Box mybox = new Box();
    double volume;
    mybox.length = 10;
    mybox.width = 12;
    mybox.breadth = 13;

    volume = mybox.length * mybox.width * mybox.breadth;
    System.out.println("The volume of the box is: " + volume);
  }
}
