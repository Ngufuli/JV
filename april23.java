import java.util.*;
import java.lang.*;

class Replace{
    int first;
    int second;
    int third;



    void get(int a, int b){
        first = a;
        second = b;
    }


    void replacingNumbers(){
        third = first;
        first = second;
        second = third;
    }
    
    void display(){
        System.out.println("The value of First is :" + first);
        System.out.println("The value of Second is: " + second);
    }
}

public class april23{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();

        Replace r = new Replace();
        r.get(a, b);
        r.replacingNumbers();
        r.display();
    }
}