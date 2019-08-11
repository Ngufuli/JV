import java.lang.*;
import java.util.*;

interface A{
    void read();
}

class B{
    void display(A obj){
        obj.read();
    }
}

class anonymousClassAsAnArgument{
    public static void main(String[] args){
        B b = new B();

        b.display( new A(){
            public void read(){
                System.out.println("Anonymous class as an argumnet");
            }
        }

        );
    }
}