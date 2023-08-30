package Arrays;
import java.util.Scanner;

// Q4. Write a Program to find product of elements at even index

public class Arr6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];

        int product = 1;
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }

        System.out.println("===================");

        for (int j = 0; j < arr.length; j++) { 

            if (j%2 == 0) {

                product = product * arr[j];
                
            }

        }        
        System.out.print("PRODUCT OF ELEMENTS IN ARRAY IS : " + product);


        sc.close();

    }
}
