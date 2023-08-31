package Arrays;
import java.util.Scanner;

// Q10. Write a program to find FIRST BIGGEST AND SECOND BIGGEST ELEMENT in given array
//(((((pending)))))

public class Arr12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {   
            
            System.out.print("ENTER VALUE " + i + " IN ARRAY : ");   
            arr[i] = sc.nextInt();
        }
        
        System.out.println("===================");        

        int num = arr[0];
        int num1 = arr[1];

        // {1,3,7,8,20}
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] >= num) {
                num = arr[i];
            }
            
        }

        System.out.println("1s BIGGEST NUMBER IS : " + num);

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] >= num) {
                num1 = arr[i];
            }
            
        }
        System.out.println("2nd BIGGEST NUMBER IS : " + num1);
        

        sc.close();

    }
}
