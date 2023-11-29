package package1;
public class regex4 {
    public static void main(String[] args) {
        //pattern for values from 
        //  0-99
        // 100 -1000
        // 1001- 9998
        // 9999- 100000
        // 725 - 795

        //0-99
        String str1="99";
        String pattern="[0-9][0-9]";
        System.out.println(str1.matches(pattern));

        //100-1000
        str1="1000";
        pattern="[1-9][0-9][0-9]|1000";
        System.out.println(str1.matches(pattern));

        //1001-9998
        str1="9998";
        pattern="[1-9][0-9][0-9][1-8]";
        System.out.println(str1.matches(pattern));

        //9999-100000
        str1="100000";
        pattern="9999|[1-9][0-9][0-9][0-9][0-9]|100000";
        System.out.println(str1.matches(pattern));

        //725-795
        str1="795";
        pattern="72[5-9]|7[3-8][0-9]|79[0-5]";
        System.out.println(str1.matches(pattern));

    }
    
}
