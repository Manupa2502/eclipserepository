package package1;
public abstract class abstractclass {
    int a;
    //abstarct class methods implemenattion can be used only by child calss
    abstractclass(){
        //abstract class can have constructor
    }
    abstract void doubletap();//{
       //abstract class can have only declaration implementations will be present in inherting class

   // }
    static void staticmethod(){
        //abstract class can have static method
        System.out.println("abstract class can have static method");
    }
    //default void defaultmethod(){

        //default mehods are not allowed in abstract class
    //}
    void regularmethod(){
        System.out.println("abstarct class can have regular methods as well");
        //abstarct class can have regular methods as well
    }
}
