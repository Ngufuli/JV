import java.io.*;
class A{
    public static void main(String[] args) throws Exception{
        File f = new File("abc.txt");
        f.createNewFile();

        PrintWriter output = new PrintWriter(f);
        output.println("Java Class");
        output.println("Hello world");
        output.println("File Handling using java");
        output.close();
    }
}