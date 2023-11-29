package package1;
public class methodoverloading1 {
    public static void main(String[] args) {
        methodoverloading ob1=new methodoverloading();
        System.out.print("ob1.method() ");ob1.method();//calling method without parameter
        System.out.print("\nob1.method(100,200) ");ob1.method(100, 200);//calling method with int,int
        System.out.print("\nob1.method(200,400.5f) ");ob1.method(300, 400.5f);//calling method with int,float
        System.out.print("\nob1.method(500.5f,600) ");ob1.method(500.5f, 600);//calling method with float,int
        System.out.print("\nob1.method(700.5f,800.5f) ");ob1.method(700.5f, 800.5f);//calling method with float,float
        System.out.print("\nob1.method(900,1000,1100) ");ob1.method(900, 1000, 1100);//calling method with int,int,int
    }
    
}
