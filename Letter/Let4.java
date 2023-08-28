package Letter;
import java.util.Scanner;

//Ques   --> below to print...  its A letter   (pending)

//          *  
//         * *  
//        *   * 
//       *     *   
//      * * * * *  
//     *         *  
//    *           *


public class Let4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("ENTER A NUMBER : ");        
        int n = sc.nextInt();
        System.out.println("-------------------");

        for (int i = 1; i <= n; i++) {  
                
            for (int j = n; j > i; j--) {

                System.out.print("_");
            }            
            for (int k = 1; k <= 2*i-1; k++) {                
                System.out.print("*");                    
            }            
            for (int m = n; m > i; m--) {

                System.out.print("_");
            }            
            System.out.println(" ");
        }
        

        sc.close();
    }
}
