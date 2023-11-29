package package1;
public class interfacemain {
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

    //class must implement all the methods which are there in family tree of the interface or the abstract class
    //ex: interface1->interface2->interface3->abstract interfaceclass1-?interfaceclass2
    //interfaceclass2 must implememnt all the methods present in  the all parents
    //to call the static method we need to use the interfacename.methodname
    //interface can extend multiple interfaces
    //class can implement multiple interfaces
    //we can achieve mulilvel inheritence by interface
    //
    public static void main(String[] args) {
        interfaceclass2 ob1=new interfaceclass2();
        System.out.println("child class interfaceclass2 implementing all parent class below methods");
        ob1.method1();
        ob1.method2();
        ob1.method3();
        ob1.method4();
        ob1.method6();
        ob1.method7();
        ob1.method8();
    }
}
