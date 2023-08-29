package Arrays;
import java.util.Scanner;


public class Arr1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String names[] = new String[5];           //Array declaration


        for (int i = 0; i < 5; i++) {    // this loop is for initalizing a value to each index of arr
            
            System.out.print("ENTER A STRING : ");   // by taking value from user 
            names[i] = sc.nextLine();
        }

        System.out.println("===================");

        for (int i = 0; i < 5; i++) {  // this loop is for printing a value of arr
            System.out.println("Name " + i + ": " + names[i]);
        }



        sc.close();

    }
}
