package package1;
public class classandobject4 {
    public static void main(String[] args) {
        //whatever changes made to varaible of object is restricted to that particular object
        classandobject3 ob1=new classandobject3();
        ob1.a=100;
        ob1.str="abcd";
        classandobject3 ob2=new classandobject3();
        ob2.a=200;
        ob2.str="efgh";
        ob1.display();
        ob2.display();
        ob1.display();
    }
}
