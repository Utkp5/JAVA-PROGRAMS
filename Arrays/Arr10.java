package Arrays;
import java.util.Scanner;

// Q8. Write a program to SEARCH AN ELEMENT IN THE EXISTING ARRAY

public class Arr10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];

        int check_element = 0;
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }
        
        System.out.println("===================");
        
        System.out.print("Now Enter The Element to check whether it is present or not : ");
        check_element = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == check_element) {
                System.out.println("ENTERED ELEMENT IS PRESENT!");
            }   
            // else if (arr[i] != check_element) {
            //     System.out.println("ENTERED ELEMENT IS NOT PRESENT!");
                
            // }         
            
        }
        

        sc.close();

    }
}
