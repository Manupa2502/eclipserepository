package package1;
public class bitwiseoperator {
    public static void main(String[] args) {
        int a=60;
        int b=70;
        System.out.println("value of a="+a+" b="+b);
        System.out.println(a&b);//binary representation of a=0111100 & 1000110 output is 00000100(4)
        System.out.println(a|b);//a=0111100|1000110 output is 1111110(126)
        System.out.println(~a);//a=0111100 complinent of is 
                                //      +1
                                // 0111101(-61)         
    }
}
