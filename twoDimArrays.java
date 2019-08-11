import java.util.*;
import java.lang.*;

class twoDimArrays{
  public static void main(String[] args){
    int a[][] = new int[3][3];
    Scanner input = new Scanner(System.in);
    //Taking user input
    System.out.println("Enter the values");
    for(int i=0; i<3; i++){
      for(int j=0; i<3; i++){
        a[i][j] = input.nextInt();
      }
    }
    //Displaying user inputs
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        System.out.print(""+a[i][j]);
        System.out.print("\n \t");
      }
    }
  }
}
