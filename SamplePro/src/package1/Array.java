package package1;
public class Array {
    


    public static void main(String[] args) {
        //-------------------------1D------------------------    
        //one dimensional array
        //array is the collection of similar dataset elements
        String[] arr;//array declaration
    String[] arr2 ={"a","b","c","d","e"};//initializing array with value with constants
    String[] arr1=new String[5];//creating object of Array with length 5
    int[] arrint=new int[5];//defaukt value will be 0's
    double[] arrdoubl=new double[5];//default value will be 0.0
    float[] arrflaot=new float[5];//default value will be 0.0
    char[] arrchar=new char[5]; //default value will be space
    //default values
    for(char x:arrchar){
        System.out.println(x);
    }
    
    //enhanced for loop to diaplay array elements
    for(String x:arr2){
        System.out.println(x);
    }
    //default value for the int array will be zeroes stored in all indexes
    //default value for the string will be null 
    for(String y:arr1){
        System.out.println(y);
    }
    arr1[2]="a";//modification on array value in index 2  
    arr1[3]="b";  
    for(String y:arr1){
        System.out.println(y);
    }
    //----------------------2D----------------------------
    //two dimensional arrays are like tables arr[row][column];
    //two dimensional arrays are used when we need to store data in the table format
    //we table
    //  0  1   2  3   4   5 
    //0 0  5   4  3   2   1
    //1 1  2   3  4   5   6
    //2 10 20  30 40  50  60  
    //3  9 19  29 39  49  59 
    //4 122 33 44   55  66 777
    //5 555 444 444 333 333 111   
    //
    //abaove tabvle as different datatypes and different length
    //declare two dimentional array
    int[][] arr2d;//2D array declaration
    int[][] arr2d1={{1,2,3,3,4},{9,8,7,6,5},{10,20,30,40,50},{9,19,29,39,49},{8,18,28,38,48}};
    int[][] arr2d2=new int[5][5];//no error
    //int[][] arr2d2=new int[][5];error always row index must be having length
    arr2d2[1][1]=1;
    arr2d2[0][0]=3;//modify the the array values
    arr2d2[2][2]=2;
    //iterate the 2D array
    for(int[] x:arr2d2){
        for(int y:x){
            System.out.println(y);
        }
    }
    //object type
    //  0  1   2  3   4   5 
    //0 a  b   c  d   e   f 
    //1 1  2   3  4   5   6
    //2 g  h   i  j   kl  mn
    //3 op qr  fff gg  gg  gg
    //4 122 33 44   55  66 777
    //5 jh      h   h   h   h    
    
    Object[] record={1234,"manu",123.4,'Y',1234.4f}; 
    Object[][] record1={{0,1,2,3,"4aa","aa"},{"a","b","c","d",5},{0.0,5.5f,"aa",'a',1234},{2.3,4.5,0.00,4.55f,1.2,"a"},{4.5,"aaa","ttt","1213233",3333,0.5f}};
    for(Object a:record){
        System.out.println(a);
    }
    for(Object[] b:record1 ){
        for(Object c:b){
            System.out.print(c);
        }
        System.out.println();
    }
}
}

