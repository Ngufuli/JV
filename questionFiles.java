import java.lang.*;
import java.util.*;
import java.io.*;

class Q{
    public static void main(String[] args) throws Exception{
        FileInputStream fin = null;
        FileOutputStream fou = null;

        try{
            File f1 = new File();
            File f2 = new File();

            fin = new FileInputStream(f1);
            fou = new FileOutputStream(f2);
            byte[] buffer = new byte[1024];
            int length;

            while((length = fin.read(buffer)) > 0){
                fou.write(buffer, 0, length);
            }
            fin.close();
            fou.close();
            System.out.println("File copied successfully!!!");
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        
    }
}