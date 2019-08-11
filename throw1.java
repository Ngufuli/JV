//throws exception --> gives instruction to a compiler that a particular class and method throws an exception

class myException extends Exception{
    int d;

    myException(int a){
        d = a;
    }
}

class A{
    void compute(int a){
        if(a > 10){
            throw new myException(a);
        }
    }
    public static void main(String[] args){
        try{
            A a = new A();
            a.compute(19);
        }
        catch(myException c){
            System.out.println(a);
        }
    }
}