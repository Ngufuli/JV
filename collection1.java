import java.lang.*;
import java.util.*;

class Student implements Comparable<Student>
{
    String name;
    int rollno;
    double cgpa;
    Student(){

    }
    Student(String n, int r, double c){
        name = n;
        rollno = r;
        cgpa = c;
    }

    public String toString()
    {
        return "name = " + name + "rollno = " + rollno + "cgpa = " + cgpa;
    }

    public int compareTo(Student s)
    {
        return this.rollno - s.rollno;
    }
}

class P91ArrayListComparable{
    public static void main(String[] args){
        ArrayList<Student> l = new ArrayList<Student>();
        l.add(new Student("Akaur",110,9.67));
        l.add(new Student("rohit",102,9.57));
        l.add(new Student("pandya",103, 9.45));

        Collections.sort(l);
        System.out.println(l);

        Iterator itr = l.iteraor();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}