package package1;
public class accessspecifier2 {
    public static void main(String[] args) {
        accessspecifiers ob1=new accessspecifiers();
        ob1.method();//public method() can be accessed without any restrictions
        //ob1.method2();error private method we cannot access out of class
        ob1.method3();//default method can be accessed within package not out of package
    }
}
