package Number;

//Ques   --> below to print

//  1 1 1 1 1
//  2 2 2 2 2
//  3 3 3 3 3
//  4 4 4 4 4
//  5 5 5 5 5

public class Num1 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {   // for row
            
            for (int col = 1; col <=5; col++) {  // for column
                
                System.out.print(row + " ");

            }            
            System.out.println();
        }
        
    }
}
