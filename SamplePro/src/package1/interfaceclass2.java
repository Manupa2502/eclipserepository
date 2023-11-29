package package1;
public class interfaceclass2 extends interfaceclass1 {
    //class must implement all the methods which are there in family tree of the interface or the abstract class
    //ex: interface1->interface2->interface3->abstract interfaceclass1-?interfaceclass2
    //interfaceclass2 must implememnt all the methods present in  the all parents
    @Override
    public void method4() {
        // TODO Auto-generated method stub
        defaultmethod();
        //to call the static method we need to use the interfacename.methodname
        interface1.staticmethod();
        System.out.println("interface2.method4");
         
        //interface can have default methods
        //throw new UnsupportedOperationException("Unimplemented method 'method4'");
    }

    @Override
    public void method6() {
        // TODO Auto-generated method stub
        System.out.println("interface3.method6");
        //throw new UnsupportedOperationException("Unimplemented method 'method6'");
    }

    @Override
    public void method3() {
        // TODO Auto-generated method stub
        System.out.println("interface2.method3");
        //throw new UnsupportedOperationException("Unimplemented method 'method3'");
        
    }


    @Override
    public void method1() {
        // TODO Auto-generated method stub
        System.out.println("interface1.method1");
        //throw new UnsupportedOperationException("Unimplemented method 'method1'");
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("interface1.method2");
        //throw new UnsupportedOperationException("Unimplemented method 'method2'");

    }

    @Override
    void method7() {
        // TODO Auto-generated method stub
        System.out.println("abstarctclass.method7");
        //throw new UnsupportedOperationException("Unimplemented method 'method7'");
    }

    @Override
    void method8() {
        // TODO Auto-generated method stub
        System.out.println("abstractclass.method8");
        //throw new UnsupportedOperationException("Unimplemented method 'method8'");
    }
    
}
