package package1;
public class abstractclass2 extends abstractclass1{


    @Override
    void camera() {
        // TODO Auto-generated method stub
        System.out.println("camera");
     
     //   throw new UnsupportedOperationException("Unimplemented method 'camera'");
    }

    @Override
    void doubletap() {
        System.out.println("doubletap");
        
        // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'doubletap'");
    }
    void callnonabstractmethods(){
           staticmethod();
     //we can call staticmethod
           regularmethod();
    //we can call regular method inside the abstract class implementations
    //by default all methods are public
    }

    
}
