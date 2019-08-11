import java.lang.*;
import java.util.*;

class java{
  int a, b, result;
  int add(){
    a=3;
    b=4;
    return a + b;
  }
  int add(int r, int s){
    a = r;
    b = s;
    return a + b;
  }

  int add(int c, int d){
    a = c;
    b = d;
    return a + b;
  }
  int result(){
    System.out.println(result);
  }
  public static void main(String[] args){
    java o = new java();
    o.add();
    o.result();

    o.add(10,10);
    o.result();

    o.add(20,20);
    o.result();

  }
}
