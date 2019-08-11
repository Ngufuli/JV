import java.util.*;
import java.lang.*;

class P71Assertion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        assert age>18:"You are not allowd to vote";
    }
}