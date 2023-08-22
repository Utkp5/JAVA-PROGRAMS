package Number;

//Ques   --> below to print

//  5 5 5 5 5
//  4 4 4 4 4 
//  3 3 3 3 3 
//  2 2 2 2 2
//  1 1 1 1 1 

public class Num4 {
    public static void main(String[] args) {

        for (int row = 5; row >= 1; row--)   // loop for row
        {  
            
            for (int col = 1; col <=5; col++)   // loop for column
            {                 
                System.out.print(row + " ");
            }            
            System.out.println();
        }
    }
}
