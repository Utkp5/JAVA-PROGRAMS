package Letter;
import java.util.Scanner;

//Ques   --> below to print...  its N letter  

//    *      * 
//    * *    *  
//    *   *  *  
//    *    * * 
//    *      *


public class Let3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("ENTER A NUMBER : ");        
        int n = sc.nextInt();
        System.out.println("-------------------");

        for (int i = 1; i <= n; i++) {  
                
            for (int j = 1; j <= n; j++) {
                
                if (j == 1 || j == n || j == i) {
                    
                    System.out.print("*");                    
                }
                System.out.print("_");
            }            
            System.out.println(" ");
        }

        sc.close();
    }
}
