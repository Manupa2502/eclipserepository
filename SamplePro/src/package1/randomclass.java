package package1;
import java.util.Random;

public class randomclass {
    public static void main(String[] args) {
        Random rm=new Random();
        for (int i=0;i<100;i++){
        //any random number    
        //System.out.println(rm.nextInt());
        //random number with in 1000
        //System.out.println(rm.nextInt(1000));
        //random number between 1000 and 10000
        //System.out.println(rm.nextInt(9000)+1000);
        //random number using math function it will 0,0.1......1 it will return frations
        //0 to 1000
        //System.out.println((int)(Math.random()*1000));
        //1000 to 10000
        System.out.println((int)(Math.random()*9000+1000));
        }
    }
}
