import java.lang.*;
import java.util.*;

class rJArray{

  public static void main(String[] args){
    int a[][] = new int[5][];

    a[0] = new int[3];
    a[1] = new int[2];
    a[2] = new int[1];
    a[3] = new int[4];
    a[4] = new int[6];
Scanner input = new Scanner(System.in);
    System.out.println("Enter the values");
    for(int i=0; i<5; i++){
      for(int j=0; j<a[i].length ; i++){
        a[i][j] = input.nextInt();
      }
    }
    //Displaying user inputs
    for(int i=0; i<5; i++){
      for(int j=0; j<a[i].length; j++){
        System.out.print(""+a[i][j]);
        System.out.print("\n \t");
  }
}
}
}
