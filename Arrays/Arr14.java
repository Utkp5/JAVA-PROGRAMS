package Arrays;
import java.util.Scanner;

// Q14. Write a program to FIND THE SECOND OCCURRENCE ELEMENT in a given

public class Arr14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }
        
        System.out.println("===================");        


        System.out.print("Enter the no of index to see the value of it : ");
        int find_index = sc.nextInt();


        int num = 0;        
        for (int j = 0; j < arr.length; j++) {            
                
                if (j == find_index) {                    
                    num = arr[j];
                    break;
                }
            
        }
        System.out.println(" second element num is " + num);
            
        

        sc.close();

    }
}
