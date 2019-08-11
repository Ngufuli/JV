@FunctionalInterface
interface A{
    void run();
}

class B{
    public static void main(String arg[]){
        A obj = ()->{
            System.out.println("Lambda expressions");
        };
        obj.run();
    }
}