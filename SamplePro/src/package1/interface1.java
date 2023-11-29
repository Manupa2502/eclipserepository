package package1;
public interface interface1 {
    //interface is the collection of abstract methods
    //inside interface by default all methods are abstract
    //interface is 
    //  similar in,
    //    only functionality will be there in interface remaining will be there in implementing class
    //    cannot have a object
    //    cannot have object of interface
    //  not similar in
    //    cannot have constructor         
    //    can have default methods
    //    cannot have data members
    //everything is public inside interface   
    //interfaces are implemeted by classes and cannot extend by class
    //interface can extend another interface and cannot implement the interface
    //int a;
    //interface cannot have unassinged variables.only final varibale=assigned; is allowed
    

    void method1();//{
 //       interface cannot have implementations for normal mehods
//    }
    void method2();

static void staticmethod(){
    System.out.println("interface can have static method");
    //interface can have static method
}
default void defaultmethod(){
    System.out.println("interface can have default method");
    //interface can have default method

}
}
