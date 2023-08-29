package Hollow;
import java.util.Scanner;

//Ques   --> below to print

//  * * * * * * *   i 1, j=5
//  * *       * *   i 2 j =4
//  *  *    *   *   i 3 j 3
//  *     *     *
//  *   *   *   *
//  * *       * *
//  * * * * * * *



public class Hol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("ENTER A NUMBER : ");        
        int n = sc.nextInt();
        System.out.println("-------------------");        

        for (int i = 1; i <= n; i++) {  
                
            for (int j = 1; j <=n; j++) {
                
                if (i==1 || i == n || j == 1 || j ==n || i == j || i+j == n) {
                    System.out.print("*");              
                    
                } else {
                    System.out.print(" ");                    
                }
                
            }
            System.out.println();            
        }
        // for (int i = 1; i < n; i++) {  
                
        //     for (int j = n-2; j >= i; j--) {
                
        //         System.out.print(" ");              
        //     }
        //     for (int j = 1; j <= i+1; j++) {
                
        //         System.out.print("*");              
        //     }

        //     System.out.println();
            
        // }

        sc.close();
    }
}
