package package1;
public class super2 extends super1 {
    super2(int a,int b){
        super(a,b);
    }
    void superclass(){
        System.out.println("this is child class");
    }
    void callsuperclass(){
        System.out.print("super.superclass() ");super.superclass();
        System.out.print("superclass() ");superclass();

    }
    
}
