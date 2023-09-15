package TwoDArray;
import java.util.Scanner;

//Q7. Create a 2d array and find occurence of odd elements.

public class two_D_odd_elemnt {
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

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("========================================");
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {  // for printing the values

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 != 0) {
                    oddCount++;
                    System.out.println("ODD Elements in 2D Array: " + arr[i][j] + " ");
                }

            }
            System.out.println();
        }
        
        System.out.println("========================================");
        System.out.println("No. of odd element in 2D array : " + oddCount);
        
        sc.close();

    }

}
