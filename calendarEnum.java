import java.lang.*;
import java.util.*;

enum Calendar{
  JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30);

  Calendar(int z){
    //int output = z;
    System.out.println("January has " + z + "days");
  }
}

public class Cal{
  public static void main(String[] args){
    Calendar C;
    C = Calendar.JANUARY;
    System.out.println(C);
  }
}
