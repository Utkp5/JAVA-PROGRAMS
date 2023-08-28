package Star;
import java.util.Scanner;

//Ques   --> below to print

//   * * * * *
//     * * * * 
//       * * *  
//         * *   
//           * 
//         * *   
//       * * *  
//     * * * * 
//   * * * * *


public class Star10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("ENTER A NUMBER : ");        
        int n = sc.nextInt();
        System.out.println("-------------------");        

        for (int i = 1; i <= n; i++) {  
                
            for (int j = 1; j < i; j++) {
                
                System.out.print(" ");              
            }
            for (int j = n; j >= i; j--) {
                
                System.out.print("*");              
            }

            System.out.println();            
        }
        for (int i = 1; i < n; i++) {  
                
            for (int j = n-2; j >= i; j--) {
                
                System.out.print(" ");              
            }
            for (int j = 1; j <= i+1; j++) {
                
                System.out.print("*");              
            }

            System.out.println();
            
        }

        sc.close();
        
    }
}
