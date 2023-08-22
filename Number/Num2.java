package Number;

//Ques   --> below to print

//  1 2 3 4 5
//  1 2 3 4 5
//  1 2 3 4 5
//  1 2 3 4 5
//  1 2 3 4 5

public class Num2 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++)   // loop for row
        {  
            
            for (int col = 1; col <=5; col++)   // loop for column
            {                 
                System.out.print(col + " ");
            }            
            System.out.println();
        }
    }
}
