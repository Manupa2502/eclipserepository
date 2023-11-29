package package1;
public class methodoverloading {
    //method overloading is the one or more methods  having same name
    //but different in 
     // length of parameter
     // data type of parameters
    
    public void method(){
        System.out.println("method without parameter");
    }
    public void method(int a,int b){
        System.out.println("method with two parameter int,int");
    }
    public void method(int a,float b){
        System.out.println("method with two parameter int,float");
    }
    public void method(float a,int b){
        System.out.println("method with two parameter float,int");
    }
    public void method(float a,float b){
        System.out.println("mrthod with two parameter float,float");
    }
    public void method(int a,int b,int c){
        System.out.println("method with three parameter int,int,int");
    }
    //public void method(int c,float d){
//error because method(int,float) already declared
  //  }
    
}
