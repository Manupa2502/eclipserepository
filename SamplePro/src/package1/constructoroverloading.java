package package1;
public class constructoroverloading {
    constructoroverloading(){
        System.out.println("default constructor");
    }
    constructoroverloading(int a, int b){
        System.out.println("int,int is the parameter");
    }
    constructoroverloading(int a,float b){
        System.out.println("in,float is the parameter");
    }
    constructoroverloading(float a,int b){
        System.out.println("flaot,int is the parameter");
    }
    constructoroverloading(float a,float b){
        System.out.println("float,float is the parameter");
    }
    constructoroverloading(int a,int b,int c){
        System.out.println("int,int,int is the parameter");
    }

}
