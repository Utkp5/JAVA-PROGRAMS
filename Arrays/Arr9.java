package Arrays;
import java.util.Scanner;

// Q7. Write a Program to reverse the elements of array without another array.

public class Arr9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }

        System.out.println("===================");
        System.out.println("Reverse Element in Array");

        for (int i = arr.length-1; i >= 0; i--) {

            for (int j = 0; j < arr.length; j++) {
                
                arr[j] = arr[i];
                System.out.println(arr[j] + " ");
            }            
        }
        

        sc.close();

    }
}
