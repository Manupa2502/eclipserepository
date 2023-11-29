package package1;
public class ThisinConstructors {
    static int a=10;
    static int b=10;
    static int c=5;
    ThisinConstructors(int a,int b,int c){
    this.a=a; //if we dont use this it will automotocally takes value 10,10,5
    this.b=b; //result will be 25
    this.c=c; // if we use the this the result will be 50
    sum(); // if we have diffrent names in arguments than global variable then no use of this
    }
    public void sum(){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        new ThisinConstructors(20, 20, 10);
    }
}
