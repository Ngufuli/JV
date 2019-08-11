import java.util.*;

class DeQueue{
    public static void main(String[] args){
        Deque obj = new  ArrayDeque();

        obj.offerFirst("a");
        obj.addFirst("b");
        obj.offer("c");
        obj.add("d");

        System.out.println("" + obj);

        obj.poll();
        System.out.println("After poll " + obj);
        obj.pollFirst();
        System.out.println("After poll first " + obj);

        obj.remove();
        System.out.println("After remove " + obj);
        obj.removeFirst();
        System.out.println("After remove first " + obj);
    }
}