package Letter;
import java.util.Scanner;

//Ques   --> below to print

//          *
//        *   *
//       *     *
//      *       *
//     *         *



public class Let5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("ENTER A NUMBER : ");        
        int n = sc.nextInt();
        System.out.println("-------------------");        

        for (int i = n; i >= 1; i--) {  
                
            for (int j = 1; j < i; j++) {
                
                System.out.print(" ");              
            }
            for (int k = 1; k == 1; k++) {
                
                System.out.print("* ");              
            }
            

            System.out.println();            
        }
        

        sc.close();
        
    }
}
