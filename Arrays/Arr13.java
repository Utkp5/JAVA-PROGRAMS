package Arrays;
import java.util.Scanner;

// 12. Write a program to FIND HOW MANY TIMES an ELEMENT OCCURED in a given array

public class Arr13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }
        
        System.out.println("===================");        

        int count = 0, num = 0;

        // {1,3,7,8,20,1}
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                
                if (arr[i] == arr[j]) {
                    count++;
                    num = arr[i];
                }
            }
            
        }
        if (count >=2) {
            System.out.println(num +" is repeated in array "+ count +" times");
            
        }
        else {
            System.out.println("No element is repeated");
            
        }
        

        sc.close();

    }
}
