package Star;

//Ques   --> below to print

//  * * * * *
//    * * * *
//      * * *
//        * *
//          *

public class Star3 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {   
                
            for (int j = 1; j <= i; j++) {  
                
                System.out.print(" ");    // for space
    
            }
            for (int k = 5; k >= i ; k--) {

                System.out.print("*");
            }                
            System.out.println();
        }

    }
}
