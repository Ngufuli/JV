import java.lang.*;
import java.util.*;

class  outerClass{
    private static int a = 10;
    int b = 20;
    private static int c = 30;

    static class innerClass{
        static final int e = 50;
        public int f = 60;
        static int g = 70;
    
    void display(){
        outerClass obj = new outerClass();
        a++;
        obj.b++;
        c++;
        obj.d++;
        //e++;
        f++;
        g++;

    
    System.out.println("Static a of outer class" + a);
    System.out.println("Non static b of outer class" + obj.b);
    System.out.println("Private static c of outer class" + c);
    // System.out.println("Private non static d of outer class" + obj.d);
    System.out.println("Static final e data member of inner class " + e);
    System.out.println("Public f data member of inner class" + f);
    System.out.println("Static g data member of inner class" + g);
        }  
    }

}

 class mainClass{
    public static void main(String[] args){
         outerClass.innerClass o = new outerClass.innerClass();
         o.display();
        
    }
}