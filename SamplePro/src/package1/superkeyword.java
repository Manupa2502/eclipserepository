package package1;
public class superkeyword {
    //super keyword refers for parent class of class we declared
    //in method overridnig if parent and child class contains method with same name then to differenciate between them we can use super
    //in method overriding the child class overrides parent if we want parent method to execute we can use super.method()
    //class A{ void abc(){ 
    //sysout(parent method)    
    //} } 
    //class B extends A{void abc(){ 
    //sysout(child method)  } 
    //void xyz(){  super.abc();  abc(); sysout("calling method")}
    //conflict for abc()
    //now we can use super to call parent class method
    //if class A extends class B then 
    //   if parent class have parameterized constructor dont have default constructor
    //     need to create a parameterized constructor in the child class
    //     we can use super(parameters) for that by default it will take super as parent class contructor name
    //for parent class variable name we can use super.variablename
    public static void main(String[] args) {
        super2 ob=new super2(10,20);
        ob.callsuperclass();
    }
}
