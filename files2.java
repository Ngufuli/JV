import java.io.*;
import java.util.*;

class Files{
    public static void main(String[]args) throws Exception{
        FileOutputStream fout = new FileOutputStream("xyz.txt");

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        s = s+sc.nextLine();

        byte a[] = s.getBytes();
        fout.write(a);
        fout.close();
        System.out.println("Saved to all named file\n");
    }
}