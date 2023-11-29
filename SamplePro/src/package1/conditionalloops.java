package package1;
public class conditionalloops {
    public static void main(String[] args) {
        int a=1;
       //while loop 
       //it will the check the condition first and then it will iterate
        while(a<10){ //while until condition becomes false it will execute
            System.out.print(a+" ");
            a++;
        } //output :1 2 3 4 5 6 7 8 9
        //
        System.out.println(" ");
        a=1000;
        //do while
        //it will execute atleast whether condition is true or false it will check after 1st iteration
        do{
            System.out.println(a);
        }while(a<10); //output is 1000
        //
        //for loop
        //it will execute from range of values specified in the condition
        //syatax: for(from_cond;to_cond;increment or decrement)
        for(int i=1;i<10;i++){
            System.out.print(i+" ");
        } //output : 1 2 3 4 5 6 7 8 9 
        System.out.println(" ");
    }
}
