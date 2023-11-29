package package1;
public class statickeyword {
    static int a=100; //without restricted to object the value of a will change for all objects
                      //we can use the static when we are using as global variable
    public void makechnages(int a){
        this.a=a;
    }
    public void display()
    {
        System.out.println(a);
    }

}
