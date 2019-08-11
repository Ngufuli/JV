import java.lang.*;
import java.util.*;

class SortById implements Comparator<Employee>
{
   public int compare(Employee e1, Employee e2){
       return(e1.id > e2.id ? 1 : -1)
   }
}

class P92ComparatorArrayList{
    public static void main(String[] args){
        ArrayList<Employee>  a1 = new ArrayList<Employee>();
        l.add(new Employee("Akaur", 12, 90067));
        l.add(new Employee("rohit", 13, 90057));
        l.add(new Employee("pandya", 14, 90045));
        System.out.println(a1);

        Collections.sort(a1, SortById());
        System.out.println(a1);

        Collections.sort(a1, new SortBySalary());
        System.out.println(a1);
    }
}