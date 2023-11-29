package package1;
public class classandobject2 {
    public static void main(String[] args) {
        //class and object
        //object is blueprint of class or real world entity
        //class is the collection of objects
        //java is called as object oriented program because what ever you make changes to variable of class is restricted only to object
        classandobject ob1=new classandobject("manu",10000,"abcdef");
        classandobject ob2=new classandobject("abcdefg", 2000000, "jsfkjsfkj");
        ob2.display();
        ob1.display();
        ob2.display();
    }
}
