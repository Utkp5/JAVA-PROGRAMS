package Arrays;
import java.util.Scanner;

// Q12. Write a program to displa The Common ELEMENT in 2 arra

public class Arr15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];
        int arr1[] = new int[5];

        
        System.out.print("ENTER VALUE IN 1st ARRAY : ");   
        for (int i = 0; i < arr.length; i++) {   
            arr[i] = sc.nextInt();            
        }

        System.out.print("ENTER VALUE IN 2nd ARRAY : ");   
        for (int i = 0; i < arr1.length; i++) {   
            arr1[i] = sc.nextInt();            
        }
        
        System.out.println("===================");


        for (int j = 0; j < arr.length; j++) {

            for (int k = 0; k < arr1.length; k++) {
                
                if (arr[j] == arr1[k]) {
                    System.out.println("same element : " + arr1[k]);
                }
            }
                
            
        }
            
        

        sc.close();

    }
}
