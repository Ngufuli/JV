//creating a customized exception
//creating a customized message
//throw-> always throws exception to the call area

class A{
    void read(){
        try{
            throw new ArithmeticException("The thrown object");//altering the message of the exception
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void main(String[]args){
        try{
            A a = new A();
            a.read();
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
    }
}