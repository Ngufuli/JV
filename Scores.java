import java.lang.*;
import java.util.*;

class Scores{
  int best = 100;
  int i;
  int a[] = new int[5];
  Scanner input = new Scanner(System.in);

  void get(){
    System.out.println("Enter the the marks of the five students");
    for(i = 0; i < a.length; i++){
      a[i] = input.nextInt();
    }
  }

    void display(){
      for(i = 0; i < a.length; i++){
        if(a[i] == (best -10)){
          System.out.println("The Grade is A");
        }
      }

        for(i = 0; i < a.length; i++)
        if(a[i] == (best - 20)){
          System.out.println("The Grade is B");
        }

        for(i = 0; i < a.length; i++)
         if(a[i] == best -30){
          System.out.println("The Grade is C");
        }

        for(i = 0; i < a.length; i++)
        if(a[i] == (best - 40)){
          System.out.println("The Grade is D");

        }


        else
        System.out.println("The Grade is F");

      }


  public static void main(String[] args){

    Scores ss = new Scores();
    ss.get();
    ss.display();
  }
  }
