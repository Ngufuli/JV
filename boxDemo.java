import java.util.*;
import java.lang.*;

class Box{
    double width;
    double height;
    double length;
}
class boxDemo{
    public static void main(String[] args){
        Box b = new Box();
        double vol;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        b.width = input.nextDouble();
        System.out.println("Enter the heght: ");
        b.height = input.nextDouble();
        System.out.println("Enter the length: ");
        b.length = input.nextDouble();

        vol = b.width * b.height * b.length;

        System.out.println("The volume of the box is: " + vol);
    }
}