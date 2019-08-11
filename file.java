import java.lang.*;
import java.util.*;
import java.io.*;

class world{
    public static void main(String[] args) throws Exception{
        try{
            int answer = 0;
            FileInputStream fin = new FileInputStream("zee.txt");
            while((answer = fin.read())!= -1){
                System.out.println("Char" + answer);
            }
        }
    }
}