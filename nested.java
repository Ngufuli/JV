import java.util.*;

class citizen{
    int age = 20;
    String name = "Jon";

    class passport{
        int entry = 10;
        String coutry = "India";

        void display(){
            System.out.println(entry);
            System.out.println(coutry);
            System.out.println(age);
            System.out.println(name);
        }
    }
}

class mainClass{
    public static void main(String[] args){
        citizen obj = new citizen();
        citizen.passport obj1 = obj.new passport();
        obj1.display();
    }
}