import java.io.*;

class Files{
    public static void main(String[]args) throws Exception{
        FileOutputStream fout = new FileOutputStream("xyz.txt");

        Scanner input = new Scanner(System.in);

        String s = input.next();
        s = s+input.nextLine();

        byte a[] = s.getBytes();
        fout.write(a);
        fout.close();
        System.out.println("Saved to all named file\n");
    }
}