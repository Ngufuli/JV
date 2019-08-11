import java.lang.*;
import java.util.*;

enum Day{
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

  Day(int z) //parametarized constructor
  {
    int price = z;
    System.out.println("" + price);
  }
}

public class P17Enum{
  public static void main(String[] args){
    Day d;
    d = Day.MONDAY; }
}
