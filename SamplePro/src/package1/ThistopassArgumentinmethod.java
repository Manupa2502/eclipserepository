package package1;
public class ThistopassArgumentinmethod {
    void A(ThistopassArgumentinmethod obj) // object refernece recieved from B()
    {
        System.out.println("method invoked "+obj );
    }
    void B(){
        A(this); //object refernece is sended to A()
    }
    public static void main(String[] args) {
        System.out.println("inside main");
        ThistopassArgumentinmethod obj =new ThistopassArgumentinmethod();
        obj.B();
    }
    
}
