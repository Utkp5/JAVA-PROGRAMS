package Arrays;
import java.util.Scanner;

// Q9. Write a program to find BIGGEST AND SMALLEST ELEMENT in the given array

public class Arr11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }
        
        System.out.println("===================");        

        int num = arr[0];
        int num1 = arr[0];

        // {1,3,7,8,20}
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] >= num) {
                num = arr[i];
            }   
            else if (num <= arr[i]) {
                num1 = arr[i];
            }
            
        }

        System.out.println("BIGGEST NUMBER IS : " + num);

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] <= num1) {
                num1 = arr[i];
            }
            
        }
        System.out.println("SMALLEST NUMBER IS : " + num1);
        

        sc.close();

    }
}
