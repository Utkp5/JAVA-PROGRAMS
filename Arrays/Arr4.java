package Arrays;
import java.util.Scanner;

// Q2. Write a Program to print all the elements of array

public class Arr4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];           //Array declaration

        for (int i = 0; i < marks.length; i++) {   
            
            System.out.print("ENTER MARKS IN " + (i+1) + " SUBJECT : ");   
            marks[i] = sc.nextInt();
        }

        System.out.println("===================");

        for (int i = 0; i < marks.length; i++) {            
            System.out.print(marks[i] + " ");
        }        


        sc.close();

    }
}
