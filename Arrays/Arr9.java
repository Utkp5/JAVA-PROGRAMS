package Arrays;
import java.util.Scanner;

// Q7. Write a Program to reverse the elements of array without another array.
// ((((pending))))

public class Arr9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }

        System.out.println("===================");
        System.out.println("Reverse Element in Array");

        for (int j = arr.length-1; j >= 0; j--) {                
                
                temp = arr[j];
                arr[j] = arr[0];
                arr[0] = temp;
                System.out.println(arr[0] + " ");
                // arr[0]++;

        }
        

        sc.close();

    }
}
