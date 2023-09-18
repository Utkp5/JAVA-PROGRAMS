package TwoDArray;
import java.util.Scanner;

//Q10. WAP to check if two arrays are identical or not.

public class two_D_elemnt_7 {
    public static void main(String[] args) {        

            Scanner sc = new Scanner(System.in);
    
            //for marix 1
            System.out.print("Enter the no. of row for marix 1 : ");
            int row = sc.nextInt();        
            System.out.print("Enter the no. of col for marix 1 : ");
            int col = sc.nextInt();
    
            //for marix 2
            System.out.print("Enter the no. of row for marix 2 : ");
            int row1 = sc.nextInt();        
            System.out.print("Enter the no. of col for marix 2 : ");
            int col1 = sc.nextInt();
    
            int arr[][] = new int[row][col]; 
            int arr1[][] = new int[row1][col1]; 
    
            System.out.println();
    
            if (row == row1 && col == col1) {
    
                for (int i = 0; i < arr.length; i++) //for taking input from user of marix 1
                {
                    for (int j = 0; j < arr[i].length; j++) {
    
                        System.out.print("Enter value for row " + (i+1) + " of marix 1 : ");
                        arr[i][j] = sc.nextInt();
    
                    }
                    System.out.println();
                }
    
                for (int i = 0; i < arr1.length; i++) //for taking input from user of marix 2
                {
                    for (int j = 0; j < arr1[i].length; j++) {
    
                        System.out.print("Enter value for row " + (i+1) + " of marix 2 : ");
                        arr1[i][j] = sc.nextInt();
    
                    }
                    System.out.println();
                }
    
               //   ---------------------------------------------- 
    
                System.out.println("============== matrix 1 ============");            
                for (int i = 0; i < arr.length; i++) { //print matrix 1
    
                    for (int j = 0; j < arr[i].length; j++) {               
                        System.out.print(arr[i][j] + "  ");
                    }
                    System.out.println();
                }      
    
                System.out.println("============== matrix 2 ============");
                for (int i = 0; i < arr1.length; i++) { //print  matrix 2
    
                    for (int j = 0; j < arr1[i].length; j++) {               
                        System.out.print(arr1[i][j] + "  ");
                    }
                    System.out.println();
                }      
    
                int identical = 0;

               for (int i = 0; i < arr.length; i++) 
                {
                    for (int j = 0; j < arr[i].length; j++) {
    
                        if(arr[i][j] != arr1[i][j])
                        {
                            identical++; 
                            break;
                        }                        
                    }
                }

                if (identical >= 1) {                    
                    System.out.println("Your matrix are not identical!");                    
                } else {
                    System.out.println("Your matrix are identical!");                    
                }
                
            } 
            else 
            {            
                System.out.println("Array row & col does not matched");            
            }
    
            sc.close();
        }
    
}
