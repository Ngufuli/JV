import java.lang.*;
import java.util.*;
import java.io.IOException;

class A{
    public static void main(String[] args)throws IOexception {
       File f1 = new File("C:\\users");
       f1.createNewFile(); // actual creation of new file
       File f2 = new File("b.txt")

       System.out.println("File Name: " + f1.getName());
       System.out.println("File Name: " + f1.getPath());
       System.out.println("File Name: " + f1.getisAbsolute());
       System.out.println("File Name: " + f1.getgetAbsolutePath());
       System.out.println("File Name: " + f1.getParent());
       System.out.println("File Name: " + f1.exists());
       System.out.println("File Name: " + f1.isDirectory());
       System.out.println("File Name: " + f1.isFile());
       System.out.println("File Name: " + f1.canWrite());
       System.out.println("File Name: " + f1.canRead());
       System.out.println("File Name: " + f1.length());
    //    System.out.println("File Name: " + f1.renameTo("New_File.txt"));
    //    System.out.println("File Name: " + f1.getdelete());
    //    System.out.println("File Name: " + f1.getName());
    //    System.out.println("File Name: " + f1.getName());
    }
}