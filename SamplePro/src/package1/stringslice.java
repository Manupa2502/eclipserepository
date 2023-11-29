package package1;
public class stringslice {
    public static void main(String[] args) {
        String str1="a_b_c_d";
        System.out.println("valueof str1= "+str1);
        //check the character at particular index
        System.out.println("str1.charAt(4) "+str1.charAt(4));
        //get the substring from the string using begin index
        System.out.println("str1.substring(2) "+str1.substring(2));
        //get the substring from the string using begin and end index
        System.out.println(" str1.substring(5,7)"+str1.substring(5,7));
        //get array of string using the delimiter
        String[] arr=str1.split("_", 0);
         System.out.print("String[] arr=str1.split(\"_\", 0) "); 
        for(String x:arr) {
            System.out.print(x+" ");
        }
        
    }
}
