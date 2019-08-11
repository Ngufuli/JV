import java.util.*;
import java.lang.*;

// abstract class B{
//     abstract void x(){
//         System.out.println("X in class B");
//     }
// }

interface A{
    void read();
}

class Z{
    public static void main(String[] args){
        B obj = new B(){
           abstract void x(){
                System.out.println("X in anonymous class");
            }
        };
    }obj.x();
}