package package1;
public class abstarctmain {
    //abstractclass ob2=new abstractclass(); cannot create object for abstarct class
    //abstract class can have only declaration implementations will be present in inherting class
    //abstarct class methods implemenattion can be used only by child class
    //abstract class can have constructor
    //abstract class can have only declaration implementations will be present in inherting class
    //abstract class can have static method
    //default mehods are not allowed in abstract class
    //abstarct class can have regular methods as well
    //abstract class can have data members
    
    public static void main(String[] args) {
        abstractclass2 ob1=new abstractclass2();
    //    abstractclass ob2=new abstractclass(); cannot create object for abstarct class
        ob1.doubletap();
        ob1.camera();
    }
    
}
