import java.util.*;

class B{
    int a = 10;
    void read(){
        System.out.println("Hey");
    }
}

class A{
    public static void main(String[] args){
    new B(){
            void read(){
                System.out.println("Hello world");
            }

            void x(){
                System.out.println("This is X");
            }
        }.x();
    }
}