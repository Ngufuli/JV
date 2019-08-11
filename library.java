import java.util.*;
import java.lang.*;

class GradeBook{
    public void displayMessage(String n){
        String j;
        j = n;
        System.out.println("Hello, welcome to the world of " + j);
    }
}

public class library{
    public static void main(String[] args){
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        input.nextLine();

        GradeBook G = new GradeBook();
        G.displayMessage(s);
    }
}