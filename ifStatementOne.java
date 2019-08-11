import java.lang.*;
import java.util.*;

class ifStatement{
  public static void main(String[] args){
    int x, y;
    x = 10;
    y = 20;

    if(x < y)
    System.out.println("X is less than Y");

    x = x * 2;
    if(x == y)
    System.out.println("Now the value of X and Y are equal");

    x = x * 2;
    if(x > y)
    System.out.println("The value of X is greater than the value of Y");
    
  }
}
