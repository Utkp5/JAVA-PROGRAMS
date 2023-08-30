package Arrays;
import java.util.Scanner;

// Q1. Write a program to INSERT the ELEMENTS in an Array

public class Arr3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];           //Array declaration

        for (int i = 0; i < marks.length; i++) {   
            
            System.out.print("ENTER MARKS IN " + (i+1) + " SUBJECT : ");   
            marks[i] = sc.nextInt();
        }        
        System.out.println("===================");


        sc.close();

    }
}
