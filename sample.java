import java.lang.*;
import java.util.*;

class Box{
    int length;
    int width;
    int height;
}
class MainBox{
    public static void main(String[] args){
        Box mbox = new Box();
        mbox.length = 100;
        mbox.widht = 200;
        mbox.height = 400;

        int val;
        val = mbox.length * mbox.width * mbox.height;
        System.out.println("The volume of the box is: " + val);
    }
}