package package1;
public class Thisforcallingconstructor {
    Thisforcallingconstructor(){ 
        this(10,20);  //this for calling constructor this shoul be present in first line of the 
        System.out.println("inside constructor");// of the constructor
    }
    Thisforcallingconstructor(int a,int b){
        System.out.println(a+b);
    }
public static void main(String[] args) {

    System.out.println("inside main");
    new Thisforcallingconstructor();
    
}
    
}
