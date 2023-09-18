package TwoDArray;
import java.util.Scanner;

//Q 11. WAP to check for identity matrix.

//   1 0 0
//   0 1 0
//   0 0 1

public class two_D_diagonal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no. of row : ");
        int row = sc.nextInt();
        
        System.out.print("Enter the no. of col : ");
        int col = sc.nextInt();
        
        
        int arr[][] = new int[row][col]; 
        int arr1[][] = new int[row][col]; 

        System.out.println("==========================");            

        for (int i = 0; i < arr.length; i++) //for taking input from user 
        {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Enter value for row " + (i+1) + " : ");
                arr[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        System.out.println("============== matrix  ============");            
        for (int i = 0; i < arr.length; i++) { //print matrix 1

            for (int j = 0; j < arr[i].length; j++) {               
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }    



        // int identity = 0;

        for (int i = 0; i < arr.length; i++) {  // for printing the values

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == arr1[0][0]) {

                    System.out.print(arr[0][0] + " ");
                        // if (arr[i][j] == 1) {
                        //     identity++;
                        //     // break;   
                        // }
                }
            }
            arr1[0][0]++;
        }
      
        // if (identity == arr.length) {
        //     System.out.println("Marix is identity");
            
        // } else {
        //     System.out.println("Marix is not identity");
            
        // }
        
        sc.close();

    }

}
