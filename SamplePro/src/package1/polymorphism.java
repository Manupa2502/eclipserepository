package package1;
public class polymorphism {
    //polymorphism is the process of instantiating object with the different forms
    //parent class can be used when the two class extending same class and contains same method names
    //this time what we can do is 
    //  create parent class object
    //  intatiate to child classes without craeting new object 
    //  now based on object form the compiler will decide to switch between class methods
//ex:
    //parent obj;
    //obj=new child1()
    //obj=new child2()
    //           .
    //           .
    //obj=new childn() 
    public static void main(String[] args) {
        polya o;
        o=new polyb();
        o.polymorphism();
        o=new polyc();
        o.polymorphism();
        o=new polya();
        o.polymorphism();
        
    }
    
}
