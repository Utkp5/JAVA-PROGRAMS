package Arrays;
import java.util.Scanner;

// Q6. Write a Program to REVERSE THE ELEMENTS of an array

public class Arr8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];
        int reverse_arr[] = new int[5];   //empty array

        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }

        System.out.println("===================");
        System.out.println("Reverse Element in Array");

        for (int i = arr.length-1; i >= 0; i--) {              
            
           reverse_arr[0] = arr[i];
           System.out.println(reverse_arr[0]);
           reverse_arr[0]++;
        }
        
        

        sc.close();

    }
}
