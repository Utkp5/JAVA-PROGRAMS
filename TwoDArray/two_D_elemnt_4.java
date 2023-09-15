package TwoDArray;
import java.util.Scanner;

//Q 5. Create a 2d array and find MIN of all the elements in a row. 

public class two_D_elemnt_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no. of row : ");
        int row = sc.nextInt();
        
        System.out.print("Enter the no. of col : ");
        int col = sc.nextInt();
        
        
        int arr[][] = new int[row][col]; 

        
        
        for (int i = 0; i < arr.length; i++) //for taking input from user 
        {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Enter value for row " + (i+1) + " : ");
                arr[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) // for printing the values
        {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + "  ");

            }
            System.out.println();
        }

        System.out.println("========================================");

        for (int i = 0; i < arr.length; i++) {  // for printing the values
            
            int min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                
            }
            System.out.println("Min Elements in 2D Array in (row " + (i+1) + ")  : "+min);
        }
      
        
        sc.close();

    }

}
