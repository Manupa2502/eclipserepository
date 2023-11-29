package package1;
public class stringconversion {
    public static void main(String[] args) {
        //string conversion from Integer to string
        //                       float   to string
        //                       double to string
        //                       byte   to string
        // vice versa can be converted
        
        int a=100;
        float f=100.5f;
        double d=100.555;


        //INT CONVERSIONS
        System.out.println("INT CONVERSIONS");
        //converting to string with the any base
        System.out.println(Integer.toString(a));//INT to string
        System.out.println(Integer.toBinaryString(a));//INT to binary string
        System.out.println(Integer.toHexString(a));//INT to hexadecimal string
        System.out.println(Integer.toOctalString(a));//INT to octal string
        //converting back string to int with base
        System.out.println(Integer.parseInt("100"));//string to int
        System.out.println(Integer.parseInt("1100100",2));//binary string to int
        System.out.println(Integer.parseInt("64",16));//hexadecimal string to int
        System.out.println(Integer.parseInt("144",8));//octal string to int

        //FLOAT CONVERSIONS
        System.out.println("FLOAT CONVERSIONS");
        //converting float to string with base 16
        System.out.println(Float.toString(f));//FLOAT to string
        System.out.println(Float.toHexString(f));//FLOAT TO HEXA DECIMAL STRING
        //converting string to float
        System.out.println(Float.parseFloat("100.5"));//string to float
        System.out.println(Float.parseFloat("0x1.92p6"));

        //DOUBLE CONVERSIONS
        System.out.println("DOUBLE CONVERSIONS");
        
        //convert double to string with 16 base
        System.out.println(Double.toString(d));//DOUBLE TO STRING
        System.out.println(Double.toHexString(d));//DOUBLE TO HEXADECIMAL STRING
        
        //CONVERTING STRING TO DOUBLE
        System.out.println(Double.parseDouble("100.555"));//STRING TO DOUBLE
        System.out.println(Double.parseDouble("0x1.923851eb851ecp6"));//HEXADECIMAL STRING TO DOUBLE


    }
}
