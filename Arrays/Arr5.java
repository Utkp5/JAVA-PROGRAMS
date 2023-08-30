package Arrays;
import java.util.Scanner;

// Q3. Write a Program to find sum of all the elements of array

public class Arr5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + (i+1) + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }

        System.out.println("===================");

        for (int i = 0; i < arr.length; i++) { 

            sum = sum + arr[i];

        }        
        System.out.print("SUM OF ELEMENTS IN ARRAY IS : " + sum);


        sc.close();

    }
}
