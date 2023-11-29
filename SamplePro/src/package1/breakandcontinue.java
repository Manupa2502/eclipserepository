package package1;
public class breakandcontinue {
    public static void main(String[] args) {
        int a=0;
        //break 
        while(a<10){
            a++;
            if (a==5){
                System.out.println(" ");
                break;//break will cancels all remaining iterartions and give controls out of loop
            }else{
                System.out.print(a+" ");
            }

        }//output :1 2 3 4
        //in these it skipped all remaining a=5 6 7 8 9 iterations
        //
        //continue
        //
        a=0;
        while(a<10){
            a++;
            if (a==5){
                continue;//skipped only for 5
            }else{
                System.out.print(a+" ");
            }   
        }//output: 1 2 3 4 6 7 8 9
         //it skipped for only a=5
        System.out.println(" "); 
    }
}
