import java.util.*;
import java.lang.*;

interface Java{
    void read();
   
}
class Program implements Java{
    public void read(){
        System.out.println("This is a program");
    }
}
class executionOne{
    public static void main(String[] args){
      Program p = new Program();
    p.read();
    }
   
}