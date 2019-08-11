import java.lang.*;
import java.util.*;

class Event{
  public String venue;

  void display(String a){
    venue = a;
    System.out.println("Party at" + venue);
  }
}
class m{
  public static void main(String ...a){
    Event e = new Event();
    e.display("Hello");
  }
}
