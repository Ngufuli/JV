class outer{
    int a = 10;
    static int b = 20;
    private static int c = 30;
    private int d = 40;

    void read(){
        int e = 50;//data members from here can not be modified in the local class, the y are treated as final(constants)
        final int f = 60;

        class local{
            void display(){
                // ++a;
                // ++b;
                // ++c;
                // ++d;
                // ++e;
                // ++f;
                System.out.println("The value of A= " + a);
                System.out.println("The value of B= " + b);
                System.out.println("The value of C= " + c);
                System.out.println("The value of D= " + d);
                System.out.println("The value of E= " + e);
                System.out.println("The value of F= " + f);
            }
               
        }
        local l = new local();
        l.display();
    }
}
class outPut{
    public static void main(String[] args){
        outer obj = new outer();
        obj.read();

      
    }
}