import java.util.*;
import java.lang.*;
import java.io.*;

class otherFile{
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream();
        byte answer[] = new byte[fin.available()];
        fin.read(answer, 0, answer.length);

        for(int i = 0; i<answer.length; i++){
            System.out.println((char)answer[i]);
        }
    }
}