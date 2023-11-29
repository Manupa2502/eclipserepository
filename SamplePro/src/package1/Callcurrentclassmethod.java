package package1;
public class Callcurrentclassmethod {
    void m(){
        System.out.println("inside M"); //used for calling current class method
        this.n();                         //java compiler will add this keyword for methods internally while compiling
    }
    void n(){
        System.out.println("inside N");
    }
    public static void main(String[] args) {
        System.out.println("inside main");
        Callcurrentclassmethod obj=new Callcurrentclassmethod();
        obj.m();
        
    }
    
}
