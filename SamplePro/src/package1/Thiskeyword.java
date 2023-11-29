package package1;
public class Thiskeyword {
    int a=10;
    Thiskeyword()
    {
        System.out.println(this);
        System.out.println(this);
        this.a=13;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("inside main");
        new Thiskeyword();
    }
    
}
