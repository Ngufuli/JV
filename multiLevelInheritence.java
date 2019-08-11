import java.util.*;
import java.lang.*;

class Engineering{
  String name;
  int courseCode;
  int section;
  Scanner input = new Scanner(System.in);

  void get(){
    System.out.println("Enter the name of Course:\n");
    name = input.nextLine();
    input.nextLine();
    System.out.println("Enter the Course Code:\n");
    courseCode = input.nextInt();
    System.out.println("Enter the Section:\n");
    section = input.nextInt();
  }
  void display(){
    System.out.println();
    System.out.println();
    System.out.println();
  }

  class ComputerScience extends Engineering{
    void get(){

    }

    void display(){

    }

  }

  class ElectricalAndElectronics extends ComputerScience{
    void get(){

    }

    void display(){

    }

  }

  class InformationTechnology extends ElectricalAndElectronics{
    void get(){

    }

    void display(){

    }
  }
}

public class Schools{
  public static void main(String[] args){
    InformationTechnology IT = new InformationTechnology();
    IT.get();
    IT.display();
  }
}
