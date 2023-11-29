package package1;
public class pattern {
    public void writefirstlines(int i){
        for(int k=0;k<i;k++){
                System.out.print("**********");
            }

    }
    public void writelastlines(int i){
        for(int k=5;k>i;k--){
                System.out.print("**********");
            }

    }
    public void writefirstspace(int i){
        for(int j=5;j>i;j--){
                System.out.print("     ");

            }
    }
    public void writelastspace(int i){
        for(int j=0;j<i;j++){
               System.out.print("     ");     
            }
    }
    public static void main(String[] args) {
        //* 
        //**
        //***
        //****
        //*****
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //*****
        //****
        //***
        //**
        //* 
        
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        //    * 
        //   **
        //  ***
        // ****
        //*****
        for (int i=0;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
            }
        //*****
        // ****
        //  ***
        //   **
        //    *  
        
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
               System.out.print(" ");     
            }
            for(int k=5;k>i;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //    ** 
        //   ****
        //  ******
        // ********
        //**********
        //**********
        // ********
        //  ******
        //   ****
        //    **  

        for(int i=0;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");

            }
            for(int k=0;k<i;k++){
                System.out.print("**");
            }
            System.out.println(" ");
        }
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
               System.out.print(" ");     
            }
            for(int k=5;k>i;k--){
                System.out.print("**");
            }
            System.out.println(" ");
        }
        
        
//                  **********                                                                  **********
//              ********************                                                        ********************
//         ******************************                                              ******************************
//     ****************************************                                    **************************************** 
//**************************************************                          **************************************************
//**************************************************                          **************************************************
//     ****************************************                                    ****************************************
//          ******************************                                              ******************************
//              ********************                                                        ********************
//                   **********                                                                  **********

        pattern obj=new pattern();
        for(int i=0;i<=5;i++){
            
            obj.writefirstspace(i);
            obj.writefirstlines(i);
            System.out.print("                          ");
            obj.writefirstspace(i);
             obj.writefirstspace(i);
            obj.writefirstlines(i);
            System.out.println(" ");
        }
        for(int i=0;i<=5;i++){
            obj.writelastspace(i);
            obj.writelastlines(i);
            System.out.print("                          ");
            obj.writelastspace(i);
            obj.writelastspace(i);
            obj.writelastlines(i);
            System.out.println(" ");
        }
        }

    }
    
