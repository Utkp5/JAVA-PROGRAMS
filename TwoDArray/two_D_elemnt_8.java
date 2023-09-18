package TwoDArray;
import java.util.Scanner;

//Q12. WAP to print lower triangular matrix.

public class two_D_elemnt_8 {
    public static void main(String[] args) {        

            Scanner sc = new Scanner(System.in);
    
            //for marix 1
            System.out.print("Enter the no. of row for marix 1 : ");
            int row = sc.nextInt();        
            System.out.print("Enter the no. of col for marix 1 : ");
            int col = sc.nextInt();           
    
            int arr[][] = new int[row][col]; 
    
            System.out.println();
    
            if (row == 3 && col == 3) {
    
                for (int i = 0; i < arr.length; i++) //for taking input from user of marix 1
                {
                    for (int j = 0; j < arr[i].length; j++) {
    
                        System.out.print("Enter value for row " + (i+1) + " of marix 1 : ");
                        arr[i][j] = sc.nextInt();
    
                    }
                    System.out.println();
                }                
    
               //   ---------------------------------------------- 
    
                System.out.println("============== matrix  ============");            
                for (int i = 0; i < arr.length; i++) { //print matrix 1
    
                    for (int j = 0; j < arr[i].length; j++) {               
                        System.out.print(arr[i][j] + "  ");
                    }
                    System.out.println();
                }      
    
                System.out.println("============== lower triangular matrix ============");

                for (int i = 0; i < arr.length; i++) { //print  matrix 2
    
                    for (int j = 0; j < arr[i].length; j++) {
                        
                        if (i >= j ) {

                            System.out.print(arr[i][j] + "  ");
                            
                        }
                    }
                    System.out.println();
                }                
                
            } 
            else 
            {            
                System.out.println("Array row & col should not be less than 3");            
            }
    
            sc.close();
        }
    
}
