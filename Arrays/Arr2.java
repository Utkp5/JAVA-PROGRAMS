package Arrays;
import java.util.Scanner;


public class Arr2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double marks[] = new double[5];           //Array declaration

        double sum = 0, per = 0;
        int count = 0;

        for (int i = 0; i < 5; i++) {    // to get a marks from user 
            
            System.out.print("ENTER MARKS IN " + (i+1) + " SUBJECT : ");   
            marks[i] = sc.nextDouble();
        }

        System.out.println("===================");
        
        for (int i = 0; i < 5; i++) {    // for sum of marks
            sum = sum + marks[i];
        }
        System.out.println("Sum of Marks : " + sum);
        
        
        for (int i = 0; i < 5; i++) {   // for percentage
            per = sum / 500 * 100; 
        }
        System.out.println("Percentage : " + per);
        
        for (int i = 0; i < 5; i++) {   // for fail subject

            if (marks[i] <=35) {
                System.out.println("You are fail in " + (i+1) + " No. Subject");
            }
        }

        // for (int i = 0; i < 5; i++) {   // for highest marks in subject

        //     if (marks[i] >= marks[i+1]) {

        //         double Hig_marks = marks[i];

        //         System.out.println("You are got Highest marks in " + (i+1) + " Subject");
        //     }
        // }

        for (int i = 0; i < 5; i++) {   // for count marks in subject more than 60

            if (marks[i] >= 60) {
                count++ ;
            }
        }
        System.out.println("You are got more than 60 marks in " + count + " Subject");

        
        System.out.println("===================");
        sc.close();

    }
}
