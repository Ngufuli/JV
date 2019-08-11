import java.io.IOexception;

class Throws1{
    //declaration systax at the end of  method name
    void x() throws IOException{
        //try   //handled
        throw new IOException();
    }

    void y() throws IOException{//declared so handler is optional
        x();
    }

    void z() //throws IOException //declared so handler is optional
    {
        try{
            y();
        }
        catch(Exception a){

        }
    }
}
class P68Throws{
    public static void main(String ...a) throws IOException{//declared so handler is optional
        Throws1 obj = new Throws1();
        obj.z();
    }
}





//difference b/w throw and throws, 5 types of check and unchecked
// purposes of throw