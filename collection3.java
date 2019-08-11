import java.util.*;
import java.lang.*;


class JavaCollection3{
    public static void main(String[] args){
        Collection<String> obj = new TreeSet<String>();
        obj.add("a");
        obj.add("b");
        obj.add("c");
        obj.add("d");

        Iterator itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println("" + itr.next());
        }
    }
}
