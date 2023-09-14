package TwoDArray;
import java.util.Scanner;

public class two_D_arr1 {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][3]; 
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < arr.length; i++) //for taking input from user 
        {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Enter value for row " + (i+1) + " : ");
                arr[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {  // for printing the values

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
      
        
        sc.close();

    }

}
