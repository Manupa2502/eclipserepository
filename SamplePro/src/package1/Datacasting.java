package package1;
public class Datacasting {
    public static void main(String[] args) {
        byte a=127;
        int b=150;
        Float f=2.2f;
        Double d=5.5;
        byte c=(byte)b;//for higher to lower datatype we need to do a external type casting
        System.out.println(c);//output:-106(not 150)
        int i=a;
        System.out.println(i);//output:127(system internally converted from byte to int)
        String str1=Byte.toString(a);//converting byte to string
        System.out.println(str1);
        String str2=Integer.toString(b);//converting integer to string
        System.out.println(str2);
        String str3=Float.toString(f);//converting float to string
        System.out.println(str3);
        String str4=Double.toString(d);//converting Double to string 
        System.out.println(str4);
    }
    
}
