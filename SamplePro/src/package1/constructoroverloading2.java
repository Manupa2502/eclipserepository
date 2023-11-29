package package1;
public class constructoroverloading2 {
    public static void main(String[] args) {
       System.out.print("constructoroverloading ob1=new constructoroverloading() "); 
       constructoroverloading ob1=new constructoroverloading();
       System.out.print("constructoroverloading ob1=new constructoroverloading(10,20) "); 
        constructoroverloading ob2=new constructoroverloading(10,20);
        System.out.print("constructoroverloading ob1=new constructoroverloading(10,20.5f) "); 
        constructoroverloading ob3=new constructoroverloading(10,20.5f);
        System.out.print("constructoroverloading ob1=new constructoroverloading(10.5f,20) "); 
        constructoroverloading ob4=new constructoroverloading(10.5f,20);
        System.out.print("constructoroverloading ob1=new constructoroverloading(10.5f,20.5f) "); 
        constructoroverloading ob5=new constructoroverloading(10.5f,20.5f);


    }
    
}
