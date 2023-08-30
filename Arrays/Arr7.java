package Arrays;
import java.util.Scanner;

// Q5. Write a Program to find sum of odd elements of an array

public class Arr7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];

        int sum_odd = 0;
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }

        System.out.println("===================");
        
        for (int j = 0; j < arr.length; j++) { 

            if (arr[j]%2 != 0) {

                sum_odd = sum_odd + arr[j];
                System.out.println("ODD ELEMENTS IN ARRAY ARE : " + arr[j]);
                
            }

        }        
        System.out.println("SUM OF ODD ELEMENTS IN ARRAY IS : " + sum_odd);
        
        System.out.println("===================");

        sc.close();

    }
}
